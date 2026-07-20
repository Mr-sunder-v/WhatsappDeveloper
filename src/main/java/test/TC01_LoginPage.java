package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Page.PIM_Page;
import Page.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_LoginPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().driverVersion("142.0.7444.135").setup();
		
		
		
//		System.setProperty("WebDriver,chrome.driver", "C:\\Users\\sunder\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--lang=en");

		
		WebDriver driver = new ChromeDriver(options);
		
		loginPage page = new loginPage(driver);
		PIM_Page page2 = new PIM_Page(driver);
		
		
		page.Url();
//		page.getUserlabel();
//		page.getPasswordlabel();
		page.enterUserName("Admin");
		page.enterPassword("admin123");
		page.clickLoginBtn();
		
		System.out.println("Working fine 1");
		
		page2.clickPIM();
		page2.clickAdd();
		page2.enterFirstName("Sunder");
		page2.enterLastName("V");
		page2.fetchID();
		page2.saveBtn();
		
		System.out.println("Working fine 2");
		
		
	}

}
