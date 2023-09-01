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
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement> elements = new ArrayList<>();
       // elements.add(driver.findElement(By.xpath("//span[text()='Downloads']")));
       // elements.add(driver.findElement(By.xpath("//span[text()='Documentation']")));
        elements.add(driver.findElement(By.xpath("//span[text()='Projects']")));
        elements.add(driver.findElement(By.xpath("//span[text()='Support']")));
        elements.add(driver.findElement(By.xpath("//span[text()='Blog']")));

        Actions ac = new Actions(driver);
        Robot r = new Robot();

        for (WebElement element : elements) {
            ac.contextClick(element).perform();
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_T);
            r.keyRelease(KeyEvent.VK_T);
            Thread.sleep(2000);
        }

        // Switch to each opened tab
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            // how to Perform actions in the new tab if needed
            // ...
            driver.close(); // Close the tab after performing actions
        }

        driver.quit();
    }
}
