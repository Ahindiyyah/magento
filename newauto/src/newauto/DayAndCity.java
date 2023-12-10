package newauto;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DayAndCity {
	WebDriver driver = new ChromeDriver();
	String WebSite = "https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";

	@BeforeTest
	public void SetUp() {
		driver.get(WebSite);
		driver.manage().window().maximize();
	}

	@Test()
	public void TheFirtsTest() throws InterruptedException {
		Random rand =new Random();

	List<WebElement>Day = driver.findElements(By.xpath("//*[@id=\"select-demo\"]/option"));
	if(!Day.isEmpty()) {
		int RandomDay = rand.nextInt(Day.size());
		WebElement RandomDia=Day.get(RandomDay);
		RandomDia.click();
		System.out.println(RandomDia);
		}
	List<WebElement>City = driver.findElements(By.xpath("//*[@id=\"multi-select\"]/option"));
	if(!City.isEmpty()) {
		int randomindex = rand.nextInt(City.size());
		WebElement randomCity = City.get(randomindex);
		randomCity.click();
	}
	WebElement Add = driver.findElement(By.id("printMe"));
	Add.click();
	
	}
}
