package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Mock {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	 WebDriver conductor=new ChromeDriver();
	 
	 //1.Get
	 conductor.get("https://www.youtube.com/");
	
	 //2.close
	 //conductor.close();
	 conductor.get("https://kite.zerodha.com/");
	//6.get URL
		 System.out.println(conductor.getCurrentUrl());
		 //7.Get Title
		System.out.println(conductor .getTitle());
		 //3.quit
	 //conductor.quit();
	 //4.max and min.
	 //conductor.manage().window().maximize();
	 //conductor.manage().window().minimize();
	 //5.navigate
	 conductor.navigate().to("https://www.flipkart.com/");
	 conductor.navigate().back();
	 conductor.navigate().forward();
	 conductor.navigate().refresh();
	//6.get URL
		 System.out.println(conductor.getCurrentUrl());
		 //7.Get Title
		System.out.println(conductor .getTitle());

	 
	 
	 

	}

}
