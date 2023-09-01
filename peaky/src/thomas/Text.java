package thomas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./blinders/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.trivago.in/?cip=91030227040912&cip_tc=12891-101-101_privacy_1690367263400800000&cip_ext_id=1690367263400800000&mfadid=adm");
		 Thread.sleep(2000);
		 WebElement ele=driver.findElement(By.xpath("//button[@data-testid='search-button']"));
		  String txt=ele.getText();
		  System.out.println(txt);
		   
		 
	}

}
