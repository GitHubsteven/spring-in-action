package com.spring.tutorial.app.jdbc.transaction;

import com.spring.tutorial.app.AppFactory;
import com.spring.tutorial.bean.model.StudentMarks;
import com.spring.tutorial.jdbc.StuMarksTraTemplate;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 21:28 2018/4/9.
 */
public class ProgramTraApp {
    public static void main(String[] args) {
        ApplicationContext context = AppFactory.getJdbcApp();
        StuMarksTraTemplate stuMarksTraTemplate = context.getBean(StuMarksTraTemplate.class);

        System.out.println("------Records creation--------" );
        stuMarksTraTemplate.create("alex", 25, 100, null);

        System.out.println("------Listing all the records--------" );
        List<StudentMarks> studentMarks = stuMarksTraTemplate.listStudents();

        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }
}
