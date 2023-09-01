package thomas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mapxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/maps/@12.9989812,77.5504667,15z?entry=ttu");
		Thread.sleep(2000);
		driver.findElement(By.xpath( "//button[@aria-label='Directions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-controls='sbsg50']")).sendKeys("majestic");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...']")).sendKeys("koramangala");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img [@data-tooltip='Best travel modes']")).click();
		
		
		

	}

}
