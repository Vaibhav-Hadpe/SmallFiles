package mockPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTableReadings {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.iplt20.com/points-table/men/2022");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	   List<WebElement> TotalColumns = driver.findElements(By.xpath("(//table[@class='ih-td-tab table table-striped']//tbody)[1]//th"));
	   for(WebElement c:TotalColumns)
	   {
		  String Headers = c.getText();
		  System.out.print(Headers+" / ");
	   }
	   System.out.println();
	   System.out.println("Total Columns are "+TotalColumns.size());
	   
	   List<WebElement> TotalRows = driver.findElements(By.xpath("(//table[@class='ih-td-tab table table-striped']//tbody)[2]//tr"));
	   System.out.println("Total Rows are "+TotalRows.size());
	   for(int i=1;i<=TotalRows.size();i++)
	   {
		   for(int j=1;j<=TotalColumns.size()+1;j++)
		   {
			   if(j==12)
			   {
				   for(int k=1;k<=5;k++)
				   {
				   List<WebElement> data = driver.findElements(By.xpath("(//table[@class='ih-td-tab table table-striped']//tbody)[2]//tr["+i+"]//td["+j+"]//span["+k+"]"));
				   for(WebElement td:data)
				   {
					   System.out.print(td.getText()+",");
				   }
				   }
			   }
			   else
			   {
		   List<WebElement> data = driver.findElements(By.xpath("(//table[@class='ih-td-tab table table-striped']//tbody)[2]//tr["+i+"]//td["+j+"]"));
		   for(WebElement td:data)
		   {
			   System.out.print(td.getText()+" | ");
		   }
			   }
		   }
		   System.out.println();
	   }
	}

}
