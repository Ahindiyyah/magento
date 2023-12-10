package newauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FastProject {
	String WebSite = "https://www.facebook.com/";
	String Email = "a-b-d-allah@hotmail.com";
	String Password = "Abdallah123";
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void SetUp() {
		driver.get(WebSite);
		driver.manage().window().maximize();
	}

	@Test()
	public void SignIn() {
		WebElement UserName = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		UserName.sendKeys(Email);
		pass.sendKeys(Password);
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		driver.manage().getCookies();

	}
}
