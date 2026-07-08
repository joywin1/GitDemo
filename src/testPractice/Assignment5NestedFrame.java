package testPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5NestedFrame {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		WebElement frame = driver.findElement(By.xpath("//frameset/frame[2]"));
		
		System.out.println(frame);
		driver.switchTo().frame(frame);
		
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
