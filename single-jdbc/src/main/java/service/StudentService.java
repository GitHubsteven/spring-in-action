package service;

import bean.StudentModel;
import dao.StudentOperate;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 11:58 2018/4/18.
 */
public class StudentService {
    public static void main(String[] args) {
        StudentOperate studentOperate = new StudentOperate();
        StudentModel first = studentOperate.getStudent(1L);
        System.out.println(first.getName());

    }
}
