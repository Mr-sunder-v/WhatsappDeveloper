package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sunder {

    public static void main(String[] args) {

        // Automatically manage ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Configure Chrome to allow remote origins (avoids WebSocket 403 error)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Launch browser
        WebDriver driver = new ChromeDriver(options);

        // Navigate to OrangeHRM demo login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Wait briefly to ensure page loads (simple sleep for demo purposes)
        try {
            Thread.sleep(3000); // Use WebDriverWait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interact with login form
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Optional: Print page title
        System.out.println("Page title after login: " + driver.getTitle());
        
        System.out.println("Sample added code for git");

        // Close browser
        driver.quit();
    }
}