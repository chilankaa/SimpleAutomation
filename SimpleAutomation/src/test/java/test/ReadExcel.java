package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static FileInputStream f;
	public static XSSFWorkbook x;
	public static XSSFSheet s;

	public static String readString(int i, int j) throws IOException {
		f = new FileInputStream("E:\\java\\java notes\\Book1.xlsx");
		x = new XSSFWorkbook(f);
		s = x.getSheet("Sheet1");
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();
	}

	public static String readFloat(int i, int j) throws IOException {
		f = new FileInputStream("E:\\java\\java notes\\Book1.xlsx");
		x = new XSSFWorkbook(f);
		s = x.getSheet("Sheet1");
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		float a = (float) c.getNumericCellValue();
		return String.valueOf(a);
	}
}

