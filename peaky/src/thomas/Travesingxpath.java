package thomas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Travesingxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./blinders/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
Thread.sleep(4000);
driver.findElement(By.xpath("//a[.='Neeyat']/../../../td[3]"));

	}

}
