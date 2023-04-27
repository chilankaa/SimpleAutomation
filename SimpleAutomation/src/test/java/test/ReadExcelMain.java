package test;

import java.io.IOException;

import test.ReadExcel;

public class ReadExcelMain {
public static void main(String[] args) throws IOException {
	System.out.println(ReadExcel.readString(1, 0));
	System.out.println(ReadExcel.readFloat(1, 1));
}
}
