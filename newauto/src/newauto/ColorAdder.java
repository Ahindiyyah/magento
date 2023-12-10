package newauto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ColorAdder {
	String WebSite = "https://www.color-hex.com/";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void SetUp() {
		driver.get(WebSite);
	
	}
	@Test()
	public void AddColor() {
		List<WebElement> Colors = driver.findElements(By.className("colordvcon"));
		for (WebElement Loon :Colors) {
			System.out.println(Loon.getText()); 
			
		}
		
	}
	

}
