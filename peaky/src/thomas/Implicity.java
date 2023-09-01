package thomas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicity{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("9790527052");
	
	driver.findElement(By.name("pass")).sendKeys("n.j.v.k");
	
	driver.findElement(By.name("login")).click();
	
	driver.quit();
}
}
