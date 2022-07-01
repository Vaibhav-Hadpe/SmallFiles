package iFrameOR_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://demoqa.com/nestedframes");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   
		   driver.switchTo().frame("frame1");
		   WebElement text1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		   System.out.println(text1.getText());
		   
		  WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		   driver.switchTo().frame(frame2);
		  WebElement Text2 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		  System.out.println(Text2.getText());

	}

}
