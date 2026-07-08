package testPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;



public class Assignment3AddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w  = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		List<WebElement> getdata = driver.findElements(By.xpath("//b/i"));
		
		String username = getdata.get(0).getText();
		String password = getdata.get(1).getText();
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("myModal")));
		
		WebElement StaticDropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(2);
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		// chrome password warning hence used this line
		driver.navigate().to("https://rahulshettyacademy.com/angularpractice/shop");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-info']")));
		
	
		
		
		
		//button[class='btn btn-info']
		List<WebElement> items = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		
		for(int i = 0; i<items.size(); i++) {
			
			items.get(i).click();
			
		}
		
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		
	}

}
