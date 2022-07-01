package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement TextBox = driver.findElement(By.name("show-hide"));
        boolean Result = TextBox.isDisplayed();
        System.out.println("Text Box status is "+Result);
        driver.findElement(By.id("hide-textbox")).click();
        boolean Result1 = TextBox.isDisplayed();
        System.out.println("Now the TextBox Status is "+Result1);
	}

}
