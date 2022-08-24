package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException, InvalidFormatException, POIXMLException {
		File f = new File("/home/gowtham/eclipse-workspace/Company/src/test/resources/gowtham.xlsx");
		FileInputStream find = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(find);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
	}
}
