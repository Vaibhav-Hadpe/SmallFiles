package excelTableReadings;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MixTableReadings {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
       File f=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\XLReadings.xlsx");
       Sheet mysheet = WorkbookFactory.create(f).getSheet("Sheet3");
       int TotalRowCount = mysheet.getLastRowNum();
       int TotalCellCount = mysheet.getRow(0).getLastCellNum()-1;
       for(int i=0;i<=TotalRowCount;i++)
       {
    	   for(int j=0;j<=TotalCellCount;j++)
    	   {
    		   Cell cell = mysheet.getRow(i).getCell(j);
    		   CellType type = cell.getCellType();
    		   
    		   if(type==CellType.STRING)
    		   {
    			   System.out.print(cell.getStringCellValue()+" ");
    		   }
    		   else if (type==CellType.NUMERIC)
    		   {
    			   System.out.print(cell.getNumericCellValue()+" ");
    		   }
    		   else if(type==CellType.BOOLEAN)
    		   {
    			   System.out.print(cell.getBooleanCellValue()+" ");
    		   }
    		   else if(type==CellType.BLANK)
    		   {
    			  System.out.print("=="); 
    		   }
    	   }
    	   System.out.println();
       }
	}

}
