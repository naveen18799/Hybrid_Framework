package thomas;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic3 {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
	//ChromeDriver driver=new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver", "./blinder/geckodiver.exe");
	//FirefoxDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "./blinders/geckodriver.exe");
	 FirefoxDriver driver=new FirefoxDriver();
}
}
