package com.spring.tutorial.dao;

import com.spring.tutorial.model.StudentModel;
import com.spring.tutorial.model.StudentModelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentModelMapper extends BaseDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated
     */
    long countByExample(StudentModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated
     */
    int deleteByExample(StudentModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated
     */
    int insert(StudentModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated
     */
    int insertSelective(StudentModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated
     */
    List<StudentModel> selectByExample(StudentModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") StudentModel record, @Param("example") StudentModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") StudentModel record, @Param("example") StudentModelExample example);
}