package excelTableReadings;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowColumnSameReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 File f=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\XLReadings.xlsx");
	      Sheet Mysheet = WorkbookFactory.create(f).getSheet("Sheet2");//Create up to sheet.
	    //Static Coding
	      for(int i=0;i<=5;i++)
	     {
	    	 for(int j=0;j<=3;j++)
	    	 {
	    		 String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
	    		 System.out.print(value+" ");
	    	 }
	    	 System.out.println();
	     }
	      System.out.println("=================================");
	   
	      //Dynamic Coding.
	      CellType Type = Mysheet.getRow(0).getCell(3).getCellType();
	      System.out.println("DataType Of Pariticular Cell is "+Type);
	      System.out.println("=================================");
	      //Total Row Count.
	      int Rows = Mysheet.getLastRowNum();
	     int TotalRowCount = Rows;
	     System.out.println(TotalRowCount);
	     
	     //Total Cell Count.
	    short Columns = Mysheet.getRow(0).getLastCellNum();
	    System.out.println(Columns);
	   int TotalCellCount = Columns-1;
	   
	   //Loops
	   for(int i=0;i<=TotalRowCount;i++) 
	   {
		   for(int j=0;j<=TotalCellCount;j++)
		   {
			  String Value = Mysheet.getRow(i).getCell(j).getStringCellValue();
			  System.out.print(Value+" ");
		   }
		  System.out.println();
	   }
	}

}
