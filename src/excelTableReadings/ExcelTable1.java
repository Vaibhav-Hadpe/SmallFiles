package excelTableReadings;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTable1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
           File f=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\XLReadings.xlsx");
           String name1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	       System.out.print(name1+" ");
	       
	       String name2 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	       System.out.println(name2);
	
	       double num1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	       System.out.print(num1+" ");
	       
	       double num2 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
	       System.out.println(num2);
	       
	       boolean result1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
	       System.out.print(result1+" ");
	       
	       boolean result2 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
	       System.out.println(result2);
	       
	        String A1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
	       System.out.print(A1+" ");
	       
	        String B1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
	       System.out.println(B1);

	}

}
