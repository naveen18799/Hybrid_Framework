package thomas;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Arthur {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		   List<WebElement> elements = new ArrayList<>();
	        elements.add(driver.findElement(By.xpath("//span[text()='Downloads']")));
	        elements.add(driver.findElement(By.xpath("//span[text()='Documentation']")));
	        elements.add(driver.findElement(By.xpath("//span[text()='Projects']")));
	        elements.add(driver.findElement(By.xpath("//span[text()='Support']")));
	        elements.add(driver.findElement(By.xpath("//span[text()='Blog']")));

	        for (WebElement element : elements) {
	        	Actions ac = new Actions(driver);
	    		ac.contextClick(element).perform();
	    		Thread.sleep(2000);
	    		Robot r = new Robot();
	    		r.keyPress(KeyEvent.VK_T);
	    		r.keyRelease(KeyEvent.VK_T);
	    		
		}
		Thread.sleep(2000);
		 Set<String> hh = driver.getWindowHandles();	
	        
		 for(String d:hh) {
	        	driver.switchTo().window(d);
	        	
	             // driver.quit();
	}

	        
	}}
