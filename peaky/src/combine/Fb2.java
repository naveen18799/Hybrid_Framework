package combine;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fb2 {
	
	@Test
	public void data1() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./blinders/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement rc = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
	Actions ac = new Actions(driver);
	ac.contextClick(rc).perform();
	Thread.sleep(2000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(2000);
    Set<String> nc = driver.getWindowHandles();	
    for(String d:nc) {
    	driver.switchTo().window(d);
    	String title=driver.getTitle();
		System.out.println(title);
		Reporter.log(title,true);
    }

}
	@Test
	public void data2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./blinders/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/locators.html");
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).click();
		String title=driver.getTitle();
		System.out.println(title);
		Reporter.log(title,true);
	}
}
