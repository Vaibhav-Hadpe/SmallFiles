package miscellineousIMPTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecharge.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<=links.size()-1;i++)
		{
			WebElement linkss = links.get(i);
			String url = linkss.getAttribute("href");
			URL lk =new URL(url);
			HttpURLConnection httpConnect = (HttpURLConnection)lk.openConnection();
			Thread.sleep(1000);
			httpConnect.connect();
			int code=httpConnect.getResponseCode();
			
			if(code>=400)
			{
				System.out.println(url+"-"+"IS Broken");
			}
			else
			{
				System.out.println(url+" Link is Valid");
			}
			
			
			
		}

	}

}
