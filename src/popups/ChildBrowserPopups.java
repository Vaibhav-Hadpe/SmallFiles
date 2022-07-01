package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("NewWindow")).click();//we get new child browser
		//It has URL and Buttons.Same as parent Browser.
		
		//To perform actions on child browser we need to switch the focus from 
		//main page to child browser by ids.
		
		//1.to get ids of main and child we use .getwindowhandles method and it returns set of Strings.
		//If we want only id of main then we use .getwindowhandle method(for Single ID).
		
		Set<String> allIDs = driver.getWindowHandles();//Returns IDs of all windows
		//i.e. Set of Strings we need to convert it into arraylist to get proper
		//one by one id.Because get(index) method not supports in set of Strings.
		System.out.println(allIDs);//we confused which id of main and child.
		
		//2.Convert it into array list. array is String type.
		ArrayList<String> ar=new ArrayList<>(allIDs);
		for(int i=0;i<=ar.size()-1;i++)//we get all ids line by line startinng with main.
		{
			System.out.println(ar.get(i));
		}
		//2.a>we can also store id in reference variable
		String MainPageID = ar.get(0);
		String ChildPageID = ar.get(1);
		System.out.println("Main Page ID= "+MainPageID);
		System.out.println("Child Page ID= "+ChildPageID);
		
		//3.Now switch the focus of selenium to child window.We have prepared id.
		driver.switchTo().window(ChildPageID);
		Thread.sleep(2000);//Now once focus shifted we can perform any action by 
		//using webdriver and webelement methods.
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("the7-search")).sendKeys("PopUps");
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		
		
		
		

	}

}
