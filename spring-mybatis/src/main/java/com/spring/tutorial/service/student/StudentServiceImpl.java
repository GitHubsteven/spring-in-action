package com.spring.tutorial.service.student;

import com.spring.tutorial.dao.StudentModelMapper;
import com.spring.tutorial.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 15:43 2018/4/18.
 */
@Service
public class StudentServiceImpl implements IStudentService {
    private final StudentModelMapper studentModelMapper;
    private final Random random = new Random();

    public StudentServiceImpl(StudentModelMapper studentModelMapper) {
        this.studentModelMapper = studentModelMapper;
    }

    @Override
    public int createStudent() {
        StudentModel studentModel = new StudentModel("name" + random.nextInt(100), 12, true, "chinese");
        return studentModelMapper.insert(studentModel);
    }
}
