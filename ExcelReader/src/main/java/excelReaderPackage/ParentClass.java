package excelReaderPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParentClass


{

	static FileInputStream f;//FileInputStream is an inbuilt class in IO package to read data from file
	static XSSFWorkbook wb;//XSSFWorkbook is an inbuilt class in apachae to read data
	static XSSFSheet   sh;//XSSFSheet is an inbuilkt class in apachae used to read data from sheet
	
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("D:\\Book1.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");//getSheet is a method used to get values/data from sheet
		XSSFRow r =sh.getRow(a);//XSSFRow inbuilt class of apachae used to take data from row, and method used is getRow
		XSSFCell c = r.getCell(b);//XSSFCell nbuilt class of apachae used to take data from column, and method used is getCell
		return c.getStringCellValue();// is a method used to get string data frm cell
	}
	
	public static String getIntegerData(int a, int b) throws IOException
	{
		f=new FileInputStream("D:\\Book1.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int)c.getNumericCellValue();//typecasting. getNumericCellValue method is used to get double value to int and get it
		return String.valueOf(x);//Type conversion is done with valueOf method
		
		
	}
	
	public static String getFloatData(int a, int b) throws IOException
	{
		f=new FileInputStream("D:\\Book1.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		float x=(float)c.getNumericCellValue();//typecasting. getNumericCellValue method is used to get double value to int and get it
		return String.valueOf(x);//Type conversion is done with valueOf method
		
		
	}
}
