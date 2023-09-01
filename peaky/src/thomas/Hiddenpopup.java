package thomas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
//		driver.findElement(By.xpath("//div[text()='Thu, Aug 3']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='26']")).click();
		

	}

}
