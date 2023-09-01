package methodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelexe {
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void test1(String browser) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./blinders/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys("9790527052");
			Thread.sleep(2000);
			driver.findElement(By.name("pass")).sendKeys("n.j.v.k");
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			String title=driver.getTitle();
			System.out.println(title);
		}
		else
		{
			 driver=new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			 driver.findElement(By.name("email")).sendKeys("9790527052");
				Thread.sleep(2000);
				driver.findElement(By.name("pass")).sendKeys("n.j.v.k");
				Thread.sleep(2000);
				driver.findElement(By.name("login")).click();
				Thread.sleep(2000);
				String title=driver.getTitle();
				System.out.println(title);
		}
		}
	}
	


