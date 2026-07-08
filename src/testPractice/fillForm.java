package testPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class fillForm {

	public static void main(String[] args) {
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		driver.findElement(By.name("name")).sendKeys("Mac");
		driver.findElement(By.name("email")).sendKeys("Mac@book.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Mac123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		
		// select from dropdown
		
		WebElement StaticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(StaticDropdown);
		
		dropdown.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("01/01/2001");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		
		
		
		
		

	}

}
