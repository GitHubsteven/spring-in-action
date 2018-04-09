package com.spring.tutorial.jdbc;

import com.spring.tutorial.bean.mapper.StudentMasksMapper;
import com.spring.tutorial.bean.model.StudentMarks;
import com.spring.tutorial.dao.StuMarksDao;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.List;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 20:14 2018/4/9.
 */
public class StuMarksTraTemplate implements StuMarksDao {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;
    private PlatformTransactionManager transactionManager;

    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     *
     * @param ds
     */
    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    /**
     * This is the method to be used to create
     * a record in the Student and Marks tables.
     *
     * @param name
     * @param age
     * @param marks
     * @param year
     */
    @Override
    public void create(String name, Integer age, Integer marks, Integer year) {
        //事务默认值
        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);

        try {
            String SQL1 = "insert into Student (name, age) values (?, ?)";
            jdbcTemplate.update(SQL1,name,age);
            String SQL2 = "select max(id) from Student";
            int sid = jdbcTemplate.queryForObject(SQL2,Integer.class);

            String SQL3 = "insert into Marks(sid, marks, year) " + "values (?, ?, ?)";
            jdbcTemplate.update( SQL3, sid, marks, year);

            System.out.println("Created Name = " + name + ", Age = " + age);
            transactionManager.commit(status);
        } catch (DataAccessException | TransactionException e) {
            System.out.println("Error in creating record, rolling back");
            transactionManager.rollback(status);
            throw e;
        }
        return ;
    }

    /**
     * This is the method to be used to list down
     * all the records from the Student and Marks tables.
     */
    @Override
    public List<StudentMarks> listStudents() {
        String SQL = "select * from Student, Marks where Student.id=Marks.sid";
        List <StudentMarks> studentMarks = jdbcTemplate.query(SQL,
                new StudentMasksMapper());

        return studentMarks;
    }

    public StuMarksTraTemplate setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
        return this;
    }
}
