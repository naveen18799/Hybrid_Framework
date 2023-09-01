package thomas;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Basic4 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		Thread.sleep(4000);
		Driver.close();
	}

}
