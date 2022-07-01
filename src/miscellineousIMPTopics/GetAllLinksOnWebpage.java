package miscellineousIMPTopics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinksOnWebpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		//we need to find how many links and which they are? So there are multiple links on every
		//webpage so we can find them by using FindElements(use to find multiple elements)method and
		//use locator type tagname.Stored it in ref. variable Returns list of Web elements.
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(AllLinks.size());//Size method to get count.
		
		//1.Using Iterator.
		Iterator<WebElement> it = AllLinks.iterator();//Iterator to get one by one link.
		while(it.hasNext())
		{
			System.out.println(it.next().getText());//Get text is imp.
		}
		System.out.println("=============================");
		
		//2.Using List Iterator
		ListIterator<WebElement> lit = AllLinks.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next().getText());
		}
		System.out.println("=============================");
		
		//3.Using For Each Loop
		for(WebElement f:AllLinks)
		{
			System.out.println(f.getText());
		}
		System.out.println("=============================");
		
		//4.Using for Loop
		for(int i=0;i<=AllLinks.size()-1;i++)
		{
			System.out.println(AllLinks.get(i).getText());
		}
		System.out.println("=============================");
		Thread.sleep(2000);
		driver.close();

	}

}
