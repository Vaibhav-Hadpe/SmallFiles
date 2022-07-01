package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmButton")).click();
		
		Alert Confirm = driver.switchTo().alert();
		String Text = Confirm.getText();
		System.out.println(Text);
		Thread.sleep(3000);
		Confirm.accept();
		//Confirm.dismiss();
		
		
		
		

	}

}
