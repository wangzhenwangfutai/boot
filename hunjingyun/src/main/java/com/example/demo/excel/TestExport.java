package com.example.demo.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.StudentDTO;

/**
 * @Author:wangzhen
 * @Date: 2018/9/16 21:32
 */
public class TestExport {

    public static void main(String[] args) {
        List<StudentDTO> list = new ArrayList<>();
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setAge("21");
        studentDTO.setName("王祖贤");
        studentDTO.setSex("女");
        list.add(studentDTO);

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO.setAge("21");
        studentDTO.setName("齐秦");
        studentDTO.setSex("男");
        list.add(studentDTO);

        StudentDTO studentDTO2 = new StudentDTO();
        studentDTO.setAge("45");
        studentDTO.setName("王祖贤");
        studentDTO.setSex("女");
        list.add(studentDTO);

        StudentDTO studentDTO3 = new StudentDTO();
        studentDTO.setAge("45");
        studentDTO.setName("齐秦");
        studentDTO.setSex("男");
        list.add(studentDTO);

         ExcelUtil<StudentDTO> excelUtil = new ExcelUtil<>(StudentDTO.class);
        File file = new File("D:/a.xls");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        excelUtil.exportExcel(list,"学生信息",fileOutputStream);

    }
}
