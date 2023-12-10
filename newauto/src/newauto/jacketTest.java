package newauto;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jacketTest {
	WebDriver driver = new ChromeDriver();
	String WebSite = "https://magento.softwaretestingboard.com/men/tops-men/jackets-men.html";

	@BeforeTest
	public void SetUp() {
		driver.get(WebSite);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Test()
	public void AddItem() throws InterruptedException {
		WebElement FirstItem = driver
				.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a"));
		FirstItem.click();
		Random rand = new Random();
		List<WebElement> Sizes = driver.findElements(
				By.xpath("//div[@class=\"swatch-attribute-options clearfix\"]/div[@class=\"swatch-option text\"]"));
		if (!Sizes.isEmpty()) {
			int randomIndex = rand.nextInt(Sizes.size());
			WebElement randomElement = Sizes.get(randomIndex);
			randomElement.click();
		}
		Thread.sleep(2000);
		List<WebElement> Colors = driver.findElements(
				By.xpath("//div[@class=\"swatch-attribute-options clearfix\"]/div[@class=\"swatch-option color\"]"));
		if (!Colors.isEmpty()) {
			int randomcolor = rand.nextInt(Colors.size());
			WebElement randomelement = Colors.get(randomcolor);
			randomelement.click();
		}

		WebElement AddCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span"));
		AddCart.click();

		WebElement PRICE = driver.findElement(By.className("price"));
		WebElement NAME = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span"));

		String name = NAME.getText();
		String Price = PRICE.getText();

		System.out.println("the item ou chose is " + name + " its price is " + Price);

	}
}
