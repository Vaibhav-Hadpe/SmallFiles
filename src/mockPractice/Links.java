package mockPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		//1.locate and save it into reference variable.
		WebElement Cars = driver.findElement(By.id("cars"));
		
		//2.object creation of select class
		Select s=new Select(Cars);
		
		boolean Result = s.isMultiple();
		System.out.println("Multiple selection is possible "+Result);
		
		s.selectByVisibleText("Volvo");
		s.selectByValue("audi");
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		for(int i=0;i<=s.getOptions().size()-1;i++)
		{
			System.out.println(s.getOptions().get(i).getText());
		}
//		s.deselectByIndex(0);
//		Thread.sleep(2000);
//		s.deselectByValue("opel");
//		Thread.sleep(2000);
//		s.deselectByVisibleText("Audi");
//		Thread.sleep(2000);
		
		String First = s.getFirstSelectedOption().getText();
		System.out.println(First);
		
		int Size = s.getAllSelectedOptions().size();
		System.out.println(Size);
		
	
		
		
		
		
		
		
		
		
	    
	}

}
