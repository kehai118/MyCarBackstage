package com.kehai.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.*;

public class ExportExcel {
    public static Workbook export(String title,String[] titles,String[] columns,List<Map<String,Object>> maps){
        final HSSFWorkbook workbook = new HSSFWorkbook();
        final HSSFSheet sheet = workbook.createSheet(title);
        Row row = sheet.createRow(0);
        for (int i = 0; i < titles.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(titles[i]);
        }
        for (int i = 0; i < maps.size(); i++) {
            Row row1 = sheet.createRow(i + 1);
            for (int j = 0; j < titles.length; j++) {
                Cell cell = row.createCell(j);
                final Map<String, Object> stringObjectMap = maps.get(i);
                final Object o = stringObjectMap.get(columns[j]);
                cell.setCellValue(o.toString());
            }
        }
        return workbook;
    }
}
