package scrollingTestClasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import scrollingBaseClasses.LaunchSitevleocity;
import scrollingPomClasses.VelocityracticePage;
import scrollingUtilityClasses.UtilityScrolling;
@Listeners (sCrollingListners.Listners.class)
public class ScrollAndScreenshotTestClass extends LaunchSitevleocity{
	VelocityracticePage practicepage;
	@BeforeClass
	public void LaunchBrowser() throws IOException
	{
		openBrowser();
		practicepage=new VelocityracticePage(driver);
	}
	@Test
	public void scrollToRadioButton () throws IOException
	{
		WebElement RadioButton1 = practicepage.radiobutton();
		UtilityScrolling.ScrolltoElement(driver, RadioButton1);
		UtilityScrolling.implicitwait(driver, 1000);
		UtilityScrolling.takescreenshot(driver);
	}
	@Test
	public void scrollToHideButton() throws IOException
	{
		WebElement HideButton = practicepage.hideButton();
		UtilityScrolling.ScrolltoElement(driver, HideButton);
		UtilityScrolling.implicitwait(driver, 1000);
		UtilityScrolling.takescreenshot(driver);
	}
  @Test
  public void scrollToIframeButton() throws IOException 
  {
	 WebElement IFrameButton = practicepage.iframebutton();
	 UtilityScrolling.ScrolltoElement(driver, IFrameButton);
	 UtilityScrolling.implicitwait(driver, 1000);
	 UtilityScrolling.takescreenshot(driver);
	  
  }
}
