import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Method {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize the WebDriver (in this case, ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Navigate to the desired webpage
        driver.get("https://www.example.com");

        // Cast the driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Capture screenshot as File
        File src = ts.getScreenshotAs(OutputType.FILE);

        // Define the destination directory path
        File dstDir = new File("C:\\Users\\ADMIN\\OneDrive\\Pictures\\Saved Pictures");

        // Ensure the destination directory exists
        dstDir.mkdirs();

        // Define the destination file path
        File dst = new File(dstDir, "screenshot.png");

        try {
            // Copy the screenshot file to the destination
            FileHandler.copy(src, dst);
            System.out.println("Screenshot saved to: " + dst.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
