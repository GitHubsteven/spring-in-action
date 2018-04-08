package com.spring.tutorial.jdbc;

import com.spring.tutorial.bean.mapper.StudentMapper;
import com.spring.tutorial.bean.model.Student;
import com.spring.tutorial.dao.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 12:51 2018/4/8.
 */
public class StudentJDBCTemplate implements StudentDao{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;


    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     *
     * @param ds
     */
    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(ds);
    }

    /**
     * This is the method to be used to create
     * a record in the Student table.
     *
     * @param name
     * @param age
     */
    @Override
    public void create(String name, Integer age) {
        String SQL = "insert into Student (name, age) values (?, ?)";
        jdbcTemplateObject.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     *
     * @param id
     */
    @Override
    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new StudentMapper());

        return student;
    }

    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */
    @Override
    public List<Student> listStudents() {
        String SQL = "select * from Student";
        //query method
        List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }

    /**
     * This is the method to be used to delete
     * a record from the Student table corresponding
     * to a passed student id.
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        //delete ,add,update these three operations is called as "update"
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }

    /**
     * This is the method to be used to update
     * a record into the Student table.
     *
     * @param id
     * @param age
     */
    @Override
    public void update(Integer id, Integer age) {
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }
}
