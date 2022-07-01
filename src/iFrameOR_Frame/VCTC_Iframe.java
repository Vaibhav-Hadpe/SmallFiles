package iFrameOR_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VCTC_Iframe {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://vctcpune.com/selenium/practice.html");
	   driver.manage().window().maximize();
	   Thread.sleep(1000);
	   
	   //I frame one page embeded on to other page to perform action on that embeded webpage
	   //we need to change the focus of selenium from main to that frame.
	   //we can switch focus step by step not directly from main to third frame.
	  
	   Thread.sleep(3000);
	   driver.switchTo().frame("iframe-name");//searched by name or id. Index or Webelement.
	   driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
	   Thread.sleep(1000);
	   //now the selenium focus is on iframe we need to swith it on main page to perform action
	   //on webpage.
	   
	   driver.switchTo().defaultContent();//use to go back to main page.
	   driver.findElement(By.xpath("//input[@value='Radio1']")).click();

	}

}
