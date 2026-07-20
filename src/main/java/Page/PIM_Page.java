package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PIM_Page {
	
	WebDriver driver;
	
	
	public PIM_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickPIM() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}
	
	public void clickAdd() {
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	}
	public void enterFirstName(String firstname) {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
	}
	public void enterLastName(String lastname) {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
	}
	public void fetchID() {
		WebElement text = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		String ID = text.getText();
		System.out.println(ID);
		
	}
	
	public void saveBtn() {
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}
}
