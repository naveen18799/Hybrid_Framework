package thomas;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Basic2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./blinders/geckodriver.exe");
		 FirefoxDriver driver=new FirefoxDriver();

	}

}
