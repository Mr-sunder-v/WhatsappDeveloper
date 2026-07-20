package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
	
	
	
	private WebDriver driver;
//	private WebDriverWait wait;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
//		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void Url() {
		String urlToTranslate = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String translatedUrl = "https://translate.google.com/translate?hl=en&sl=auto&tl=en&u=" + urlToTranslate;

		driver.get(urlToTranslate);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	 
	
	public boolean getUserlabel() {
		return driver.findElement(By.xpath("//label[text()='Username']")).isDisplayed();
	}
	
	public boolean getPasswordlabel() {
		return driver.findElement(By.xpath("//label[text()='Password']")).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	
	public void clickLoginBtn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
