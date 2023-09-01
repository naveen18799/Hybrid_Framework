package methodpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class href {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./blinders/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
     List<WebElement> links = driver.findElements(By.xpath("//a"));
     int count = links.size();
     System.out.println(count);
     for(int i=0;i<count;i++)
     {
    	 WebElement we = links.get(i);
    	 String att = we.getAttribute("href");
    	 System.out.println(att);
     }
}
}
