package thomas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssyoutube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./blinders/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.youtube.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[id='search']")).sendKeys("na ready tha varava song");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("div[class='style-scope ytd-video-renderer']")).click();
		 Thread.sleep(2000);
		 driver.quit();
	}

}
