package excelTableReadings;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleColumnRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
      File f=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\XLReadings.xlsx");
      Sheet Mysheet = WorkbookFactory.create(f).getSheet("Sheet2");//Create up to sheet.
      //1.Static Coding 
      for(int i=0;i<=5;i++)
      {
    	  String Value = Mysheet.getRow(i).getCell(0).getStringCellValue();
    	  System.out.println(Value);
      }
      System.out.println("===================================");
      
      //2.Dynamic Coding
      int Rows = Mysheet.getLastRowNum();
      System.out.println(Rows);//It count from 0.
      int TotalRowCount = Rows;//Don't need to minus 1 it gives perfect Index.
      for(int i=0;i<=TotalRowCount;i++)
      {
    	  String Value = Mysheet.getRow(i).getCell(0).getStringCellValue();
    	  System.out.println(Value);
      }
	}
}
