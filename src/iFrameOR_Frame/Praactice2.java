package iFrameOR_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Praactice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		   driver.manage().window().maximize();
		   Thread.sleep(1000);
		   
		   driver.switchTo().frame("iframeResult");
		   driver.findElement(By.xpath("//button[contains(text(),'Click me to ')]")).click();
		   driver.switchTo().defaultContent();
		   driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		   
		   

	}

}
