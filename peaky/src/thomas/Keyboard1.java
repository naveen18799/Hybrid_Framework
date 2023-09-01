package thomas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./blinders/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/sss.html");
		 Thread.sleep(2000);
		 WebElement sos=driver.findElement(By.xpath("//input[@id='a1']"));
		 WebElement con=driver.findElement(By.xpath("//input[@id='b1']"));
		 WebElement non=driver.findElement(By.xpath("//input[@id='c1']"));
		 Thread.sleep(2000);
		 sos.sendKeys(Keys.CONTROL+"ax");
		 Thread.sleep(2000);
		 non.sendKeys(Keys.CONTROL+"v");
		 Thread.sleep(2000);
		 con.sendKeys(Keys.CONTROL+"ax");
		 Thread.sleep(2000);
		 sos.sendKeys(Keys.CONTROL+"v");
		 Thread.sleep(2000);
		 non.sendKeys(Keys.CONTROL+"ax");
		 Thread.sleep(2000);
		 con.sendKeys(Keys.CONTROL+"v");
		 driver.close();
	}

}
