package testPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment6Options {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.id("checkBoxOption1")).click();
		String value = driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		System.out.println(value);
		
		WebElement StaticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(StaticDropdown);
		
		dropdown.selectByVisibleText(value);
		
		driver.findElement(By.id("name")).sendKeys(value);
		
		
		driver.findElement(By.id("alertbtn")).click();
		//Thread.sleep(3000);
		
		String check =  driver.switchTo().alert().getText();
							
		
		String message = "Hello Option1, share this practice page and share your knowledge";
		
		
		// never is == to compare string instead use equals or contains
		if(check.contains(message)) {
			
			driver.switchTo().alert().dismiss();
			System.out.println("pass");
		}
//		else {
//			driver.switchTo().alert().dismiss();
//			System.out.println("fail");}
	}

}
	