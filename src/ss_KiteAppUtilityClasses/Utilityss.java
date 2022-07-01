package ss_KiteAppUtilityClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Utilityss {
	public static String ReadDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\rahul\\eclipse-workspace\\5th_March_B_Selenium\\SS_TestData.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
	}
	public static void implicitwait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}

}
