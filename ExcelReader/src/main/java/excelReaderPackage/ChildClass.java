package excelReaderPackage;

import java.io.IOException;

public class ChildClass {

	public static void main(String[] args) throws IOException 
	
	{
		System.out.println(ParentClass.getStringData(1,0));
		System.out.println(ParentClass.getIntegerData(1,1));
		System.out.println(ParentClass.getFloatData(2,1));
	}

}
