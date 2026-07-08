package testPractice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment4window {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String pId = it.next();
		String cId = it.next();
		
		
		driver.switchTo().window(cId);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText()); 
		
		driver.switchTo().window(pId);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	}

}
