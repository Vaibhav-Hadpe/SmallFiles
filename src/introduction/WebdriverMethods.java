package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//1.get mehthod use to open site or to enter url in browser.
		//objname.methodname
		driver.get("https://vctcpune.com/");
		
		//2.close method use to close current tab opened by seleniun 
		//(quit method use to close all tabs that is difference between them.)
		 //driver.close();
		
		//3.quit method use to close multiple tabs opened by using 
		//selenium tool.
		// driver.quit();
		
		 //4.maximize and minimize window by usinng manage window min/max.
		 driver.manage().window().maximize();
		// driver.manage(). window().minimize();
		 
		 //5.navigate same as to get method open site but it has 3 more 
		 //options like forward,back,refresh and navigate to other page.
		 driver.navigate().to("https://www.flipkart.com/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 
		 //6.get title is method to get title of site from url.
		 System.out.println(driver.getTitle());//a.pristatement
		 String Title=driver.getTitle();//b. Reference Variable to reuse.
		 System.out.println("The title of site is "+Title);
		 
		 
		 //7.getCurrentUrl method is use to get url of site.
		 System.out.println(driver.getCurrentUrl());//a.printing statm.
		 String URL=driver.getCurrentUrl();
		 System.out.println("URL of flipkart is "+URL);

	}

}
