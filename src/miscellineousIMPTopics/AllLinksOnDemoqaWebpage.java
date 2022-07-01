package miscellineousIMPTopics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOnDemoqaWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links are "+Links.size());
		System.out.println("====================");
		
		Iterator<WebElement> it = Links.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		System.out.println("====================");
		for(WebElement f:Links)
		{
			System.out.println(f.getText()+"-"+f.getAttribute("href"));//get atributes gives 
			                                                       //links and get text gives only text
		}
		System.out.println("====================");
		
		
		

	}

}
