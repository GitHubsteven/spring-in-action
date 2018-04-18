package bean;

public class StudentModel extends BaseModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.age
     *
     * @mbg.generated
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.is_chinese
     *
     * @mbg.generated
     */
    private Boolean is_chinese;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.country
     *
     * @mbg.generated
     */
    private String country;


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.name
     *
     * @return the value of student.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.age
     *
     * @return the value of student.age
     *
     * @mbg.generated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.is_chinese
     *
     * @return the value of student.is_chinese
     *
     * @mbg.generated
     */
    public Boolean getIs_chinese() {
        return is_chinese;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.country
     *
     * @return the value of student.country
     *
     * @mbg.generated
     */
    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setIs_chinese(Boolean is_chinese) {
        this.is_chinese = is_chinese;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}