package dao;

import bean.StudentModel;
import util.ConnectUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 11:59 2018/4/18.
 */
public class StudentOperate {

    public StudentModel getStudent(Long id) {
        String sql = "select * from student where id = ?";
        PreparedStatement preparedStatement = null;
        Connection connection = ConnectUtil.getConnection();
        ResultSet resultSet = null;
        StudentModel student = new StudentModel();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                long stuId = resultSet.getLong("id");
                int age = resultSet.getInt("age");
                String name = resultSet.getString("name");
                student.setId(stuId);
                student.setAge(age);
                student.setName(name);
            }
            ConnectUtil.close(resultSet,preparedStatement,connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
}
