package com.example.demo.excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @Author:wangzhen
 * @Date: 2018/9/16 19:10
 */
public class importExcel {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/poi.xls");
        HSSFWorkbook  workbook = new HSSFWorkbook(FileUtils.openInputStream(file));
        //默认读取第一个工作表sheet
        HSSFSheet sheet = workbook.getSheetAt(0);
        int firstRowNum = 0;
        //获取sheet最后一行行号
        int lastRowNum = sheet.getLastRowNum();
        for (int i = 0;i<=lastRowNum;i++){
            HSSFRow row = sheet.getRow(i);
            int lastCellNum = row.getLastCellNum();
            for (int j =0;j<lastCellNum;j++){
                HSSFCell cell = row.getCell(j);
                String value = cell.getStringCellValue();
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
