package combine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fb1 {
	@Test
	public void data1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("9790527052");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("n.j.v.k");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Reporter.log(title,true);
		}

}
