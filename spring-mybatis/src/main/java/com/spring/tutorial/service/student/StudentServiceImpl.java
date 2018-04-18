package com.spring.tutorial.service.student;

import com.spring.tutorial.dao.StudentModelMapper;
import com.spring.tutorial.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:43 2018/4/18.
 */
@Component
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentModelMapper studentModelMapper;

    @Override
    public int createStudent() {
        StudentModel studentModel = new StudentModel("name2", 12, true, "chinese");
        return studentModelMapper.insert(studentModel);
    }
}
