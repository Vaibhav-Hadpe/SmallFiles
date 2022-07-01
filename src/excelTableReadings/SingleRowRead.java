package excelTableReadings;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleRowRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
       File f=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\XLReadings.xlsx");
      Sheet Mysheet = WorkbookFactory.create(f).getSheet("Sheet2");
     //Static coding if we change column no. then it will failed to print.
      for(int i=0;i<=3;i++)
      {
         String value = Mysheet.getRow(0).getCell(i).getStringCellValue();
         System.out.print(value+" ");
      }
      System.out.println();
      //Dynamic Coding.
      short Cells = Mysheet.getRow(0).getLastCellNum();//to get total Columns in row 0.It count from 1.
      System.out.println("Total cells are "+Cells);//But we want index staring from 0.So minus 1.
      int TotalCellCount = Cells-1;//It gives us Index.
      System.out.println("Total Cell Index are "+TotalCellCount);
      
      for(int i=0;i<=TotalCellCount;i++)
      {
    	  String Value = Mysheet.getRow(0).getCell(i).getStringCellValue();
    	  System.out.print(Value+" ");
      }
      
      
      
      
      
      
      
	}

}
