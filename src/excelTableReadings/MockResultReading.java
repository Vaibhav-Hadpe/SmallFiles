package excelTableReadings;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MockResultReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	  File f=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\Mock Inter View Results\\Group A mock result 15-05-2022.xlsx");
	  Sheet Mysheet = WorkbookFactory.create(f).getSheet("Sheet1");
	  short cells = Mysheet.getRow(0).getLastCellNum();
	  int TotalCellCount = cells-1;
	  for(int i=0;i<=TotalCellCount;i++)
	  {
		  String Value1 = Mysheet.getRow(0).getCell(i).getStringCellValue();
		  System.out.print(Value1+",");
	  }
	  System.out.println();
	  System.out.println("============================");
	  int TotalRowCount = Mysheet.getLastRowNum();
	  for(int i=0;i<=TotalRowCount;i++)
	  {
		  for(int j=0;j<=TotalCellCount;j++)
		  {
			  CellType Type = Mysheet.getRow(i).getCell(j).getCellType();
			  System.out.print(Type+",");
		  }
		  System.out.println();//Incomplete //
	  }
	  

	}

}
