package methodpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allmethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./blinders/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	     List<WebElement> links=driver.findElements(By.xpath("//a|//img"));
	     int count = links.size();
	     System.out.println(count);
	     driver.close();
	     
	
		
		 
		
		
		
		
		
	}

}
