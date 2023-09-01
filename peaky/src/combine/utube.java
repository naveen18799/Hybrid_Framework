package combine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class utube {
	@Test
	public void data1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[id='search']")).sendKeys("na ready tha varava song");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("div[class='style-scope ytd-video-renderer']")).click();
		 Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Reporter.log(title,true);
		
		
	}

}
