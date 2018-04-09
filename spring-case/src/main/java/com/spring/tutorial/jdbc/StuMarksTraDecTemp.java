package com.spring.tutorial.jdbc;

import com.spring.tutorial.bean.mapper.StudentMasksMapper;
import com.spring.tutorial.bean.model.StudentMarks;
import com.spring.tutorial.dao.StuMarksDao;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 22:05 2018/4/9.
 */
public class StuMarksTraDecTemp implements StuMarksDao {
    private JdbcTemplate jdbcTemplateObject;

    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     *
     * @param ds
     */
    @Override
    public void setDataSource(DataSource ds) {
        this.jdbcTemplateObject = new JdbcTemplate(ds);
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
        try {
            String SQL1 = "insert into Student (name, age) values (?, ?)";
            jdbcTemplateObject.update( SQL1, name, age);

            // Get the latest student id to be used in Marks table
            String SQL2 = "select max(id) from Student";
            int sid = jdbcTemplateObject.queryForObject( SQL2,Integer.class );

            String SQL3 = "insert into Marks(sid, marks, year) " + "values (?, ?, ?)";
            jdbcTemplateObject.update( SQL3, sid, marks, year);
            System.out.println("Created Name = " + name + ", Age = " + age);

            // to simulate the exception.
//            throw new RuntimeException("simulate Error condition") ;
        }
        catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            throw e;
        }
    }

    /**
     * This is the method to be used to list down
     * all the records from the Student and Marks tables.
     */
    @Override
    public List<StudentMarks> listStudents() {
        String SQL = "select * from Student, Marks where Student.id = Marks.sid";
        List <StudentMarks> studentMarks = jdbcTemplateObject.query(SQL,
                new StudentMasksMapper());

        return studentMarks;
    }
}
