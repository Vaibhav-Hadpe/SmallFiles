package iFrameOR_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://demoqa.com/nestedframes");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   
		   driver.switchTo().frame("frame1");//used id while switching from main frame to frame1.
		   Thread.sleep(2000);
		   
		   //frame 2 dont have id and name then use webelement 1.use findelemnt method xpath stored it
		   //in ref variable then use switch method.
		   WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		   driver.switchTo().frame(frame2);
		   WebElement Txt2 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));//located the element.
		   System.out.println(Txt2.getText());
		   
		   Thread.sleep(2000);
		   driver.switchTo().parentFrame();//we want to switch from frame2 to frame1 so we used parentframe
		                                   //otherwise use to default content to move at main page.
		   WebElement Txt1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		   System.out.println(Txt1.getText());
		   
		   

	}

}
