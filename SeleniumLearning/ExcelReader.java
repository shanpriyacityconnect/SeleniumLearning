package com.SeleniumLearning;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	public static final String excelFilelocation="./Data.xlsx";
	
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	
	public static void loadExcel() throws Exception
	{
		System.out.println(" Loading the Excel Data ");
		File file = new File(excelFilelocation);
		fis = new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		sh=wb.getSheet("TestData");
		fis.close();
		
	}
	
	public static Map<String,Map<String,String>> getmap() throws Exception
	{
		if(sh==null)
		{
			loadExcel();
			
		}
		
		Map<String,Map<String,String>> supermap = new HashMap<String,Map<String,String>>();
		Map<String,String> mymap =new HashMap<String,String>();
		for(int i=1;i<sh.getLastRowNum()+1;i++)
		{
			row=sh.getRow(i);
			String Keycell = row.getCell(0).getStringCellValue();
			
		
		
		int colnum=row.getLastCellNum();
		for(int j=0;j<colnum;j++) {
			String valuecell=row.getCell(j).getStringCellValue();
			mymap.put(Keycell,valuecell);
		}
		supermap.put("MASTERDATA",mymap);
		}
		
		return supermap;
	}
	
	public static String getvalue(String key) throws Exception
	{
		Map<String,String> myval= getmap().get("MASTERDATA");
		String retvalue=myval.get(key);
		return retvalue;
	}
	
	public static void main(String[] args) throws Exception
	{
		System.out.println(getvalue("Firstname"));
		System.out.println(getvalue("Lastname"));
		System.out.println(getvalue("email"));
		System.out.println(getvalue("password"));
	}
}
