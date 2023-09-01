package thomas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag {
	System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(6000);

}
