package dropdown_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleValues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement MulDrpDwn = driver.findElement(By.name("cars"));//1.Locate and store into reference variable.
		Select Cars=new Select(MulDrpDwn);//2.By using this select class object we can perform multiple fn.
		Cars.selectByIndex(0);//3.we can use for loop for selection.
		Thread.sleep(1000);
		Cars.selectByIndex(1);
		Thread.sleep(1000);
		Cars.selectByIndex(2);
		Thread.sleep(1000);
		Cars.selectByIndex(3);
		//we can select this by using visibility text and value.
		//if we want text
		WebElement Text = Cars.getAllSelectedOptions().get(0);
		//System.out.println(Text);
		System.out.println(Text.getText());
		
		 String Text1 = Cars.getFirstSelectedOption().getText();
		 System.out.println(Text1);
		 
		 for(int i=0;i<=Cars.getOptions().size()-1;i++)//use if we want text of all values in dropdown.
		 {
			 System.out.println(Cars.getOptions().get(i).getText());
		 }
		 
		 boolean Result = Cars.isMultiple();//use to check whether it is multiple selected or not.
		 System.out.println("We can select Multiple values from Dropdown "+Result);
		 Thread.sleep(1000);
		Cars.deselectByValue("volvo");//use to deselect individual.
		Thread.sleep(1000);
		Cars.deselectByVisibleText("Audi");
		 Thread.sleep(1000);
		 System.out.println(Cars.getAllSelectedOptions().size());//use to find size of selcted value.
		 Thread.sleep(1000);
	     Cars.deselectAll();//use to deselect all values at a time.
	     Thread.sleep(1000);
	     System.out.println(Cars.getAllSelectedOptions().size());//To check size of selected values.
		


	}

}
