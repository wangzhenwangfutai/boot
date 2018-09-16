package com.example.demo.dto;

import org.apache.poi.ss.usermodel.HorizontalAlignment;

import com.example.demo.utils.ExcelAttribute;

/**
 * @Author:wangzhen
 * @Date: 2018/9/16 21:06
 */
public class StudentDTO {
    @ExcelAttribute(name = "姓名", column = "A", align = HorizontalAlignment.LEFT, width = 20)
    private String name;

    @ExcelAttribute(name = "性别", column = "B", align = HorizontalAlignment.LEFT, width = 20)
    private String sex;

    @ExcelAttribute(name = "年龄", column = "C", align = HorizontalAlignment.LEFT, width = 20)
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
