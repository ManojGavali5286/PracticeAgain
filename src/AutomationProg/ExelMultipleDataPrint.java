package AutomationProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelMultipleDataPrint
{



	public static void main(String[] args) throws IOException 
	{
		String address = "C:\\MANOJ TESTING\\Book1.xlsx";
		
        FileInputStream file = new FileInputStream(address);
		
		//workbook read
		XSSFWorkbook book = new XSSFWorkbook(file) ;
		
		//sheet read
			XSSFSheet sheet = book.getSheet("Max");
			
			for(int i=0;i<=5;i++)
			{
				for(int j=1;j<=2;j++)
				{
//					double data1= sheet.getRow(i).getCell(j).getNumericCellValue();
					int data1= (int) sheet.getRow(i).getCell(j).getNumericCellValue();

					
		    	    System.out.print( data1+"   ");
		    	   
				} 
				System.out.println();
		
				
			}
			//*************************************/
			
		int lastrownum=sheet.getLastRowNum();
		System.out.println(lastrownum); //5
		
		int lastcell= sheet.getLeftCol();
		System.out.println(lastcell); //0
		
	//sheet.getlastCellNum();  --not getting
	}
}
