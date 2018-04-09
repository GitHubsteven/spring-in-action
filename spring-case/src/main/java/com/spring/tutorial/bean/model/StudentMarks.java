package com.spring.tutorial.bean.model;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 20:10 2018/4/9.
 */
public class StudentMarks {
    private Integer age;
    private String name;
    private Integer id;
    private Integer marks;
    private Integer year;
    private Integer sid;

    public Integer getAge() {
        return age;
    }

    public StudentMarks setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentMarks setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public StudentMarks setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getMarks() {
        return marks;
    }

    public StudentMarks setMarks(Integer marks) {
        this.marks = marks;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public StudentMarks setYear(Integer year) {
        this.year = year;
        return this;
    }

    public Integer getSid() {
        return sid;
    }

    public StudentMarks setSid(Integer sid) {
        this.sid = sid;
        return this;
    }
}
