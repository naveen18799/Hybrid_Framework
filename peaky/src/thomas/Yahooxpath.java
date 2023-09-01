package thomas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahooxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/?.intl=in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='phone-no ']")).sendKeys("naveensenthil99");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Extremist@1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_yb_151in   rapid-noclick-resp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-labelledby='to']")).sendKeys("naveensenthil99@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Send this email']")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}
