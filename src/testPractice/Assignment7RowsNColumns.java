package testPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7RowsNColumns {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size()); 
		System.out.println(driver.findElements(By.cssSelector(".table-display th")).size()); 
		List<WebElement> rowValue = driver.findElements(By.cssSelector(".table-display tr:nth-child(3)")); 
		
		for(int i =0; i<rowValue.size(); i++) {
			
			System.out.println(rowValue.get(i).getText());
		}
		

	}
	

}
