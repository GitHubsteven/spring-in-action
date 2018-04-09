package com.spring.tutorial.jdbc;

import com.spring.tutorial.bean.model.Student;
import com.spring.tutorial.dao.StudentDao;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;

public class StuJdbcForProcedure implements StudentDao {
    private DataSource dataSource;
    private SimpleJdbcCall simpleJdbcCall;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
    }

    @Override
    public void create(String name, Integer age) {

    }

    @Override
    public Student getStudent(Integer id) {
        return null;
    }

    @Override
    public List<Student> listStudents() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer id, Integer age) {

    }
}
