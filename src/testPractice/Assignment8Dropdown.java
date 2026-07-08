package testPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment8Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// variables 
		String country = "uni";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		
		
		
		
		
		
		
		
		
		
		
		//		
//		Actions a = new Actions(driver);
//		
//		WebElement dropdown = driver.findElement(By.id("autocomplete"));
//		
//		
//		a.moveToElement(dropdown).click().sendKeys(country).build().perform();
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='United Kingdom (UK)']")));
//		
//		//Thread.sleep(5000);
//		WebElement select = driver.findElement(By.xpath("//div[text()='United Kingdom (UK)']"));
//		a.moveToElement(select).click().build().perform();
//		
		
	}

}
