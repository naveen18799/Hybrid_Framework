package thomas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssfacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./blinders/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[id='email']")).sendKeys("9790527052");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("n.j.v.k");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[name='login']")).click();
		 Thread.sleep(2000);
		 driver.quit();
		 
		 

		

	}

}
