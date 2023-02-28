package AutomationProg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelread 
{
	public static void main(String[] args) throws IOException
	{
	
		String address = "C:\\MANOJ TESTING\\Book1.xlsx";
		
         FileInputStream file = new FileInputStream(address);
		
		//workbook read
		XSSFWorkbook book = new XSSFWorkbook(file) ;
		
		//sheet read
			XSSFSheet sheet11 = book.getSheet("Max");
//			
//			   //row
//			  XSSFRow row= sheet.getRow(2); 
//			  
//			        //cell       
//			  XSSFCell cell=row.getCell(2);
//			  
			  //get string data
//		String data= cell.getStringCellValue();	 
		//get numeric data
		
//		double data= cell.getNumericCellValue(); // 100.0-decimal
	//casting in int
	//	int data= (int) cell.getNumericCellValue(); // get 100 value
		
		//	  System.out.println(data);
			
	//***************************************************************		
			
			  //get multiple data//
			
			//data1  
			  
//			  XSSFRow row1= sheet11.getRow(2); 
//			  XSSFCell cell1=row1.getCell(1);  
//		     String data1= cell1.getStringCellValue();
//		     
//			  System.out.println(data1);      //manoj1
//			  
//			  
//			  data2
			  
			 
//			   XSSFRow row2= sheet11.getRow(2); 
//			   XSSFCell cell2=row2.getCell(2);  
//		       double data2= cell2.getNumericCellValue();
//		
//			  System.out.println(data2); //100.0
			  
	//********************************************************//
			  //method chaining program (combining all methods in one line)
			  
	double data	=  book.getSheet("Max").getRow(2).getCell(2).getNumericCellValue();
			  
			  System.out.println(data);//100.0
			  
	String data2 = book.getSheet("Max").getRow(2).getCell(1).getStringCellValue();
			  
			  System.out.println(data2);  //manoj1
			  
			  
}}
