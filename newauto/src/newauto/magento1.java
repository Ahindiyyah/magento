package newauto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class magento1 {
	WebDriver driver = new ChromeDriver();
	String WebSiteName = "https://magento.softwaretestingboard.com/";

	@BeforeTest
	public void SetUp() {
		driver.get(WebSiteName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}

	@Test(priority = 1)
	public void SignUp() throws InterruptedException {

		WebElement Sign = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
		Sign.click();

		WebElement FirtsName = driver.findElement(By.name("firstname"));
		FirtsName.sendKeys("abdallah");
		WebElement LirtsName = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		LirtsName.sendKeys("hindiyyah");
		
		WebElement Email = driver.findElement(By.id("email_address"));
		Email.sendKeys("iamher12390@gmail.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("@abdallah@123");
		WebElement PasswordC = driver.findElement(By.id("password-confirmation"));
		PasswordC.sendKeys("@abdallah@123");
		
		WebElement CreatA =driver.findElement(By.xpath("//div[@class=\"primary\"]/button/span"));
		CreatA.click();
		
		Thread.sleep(2000);
	
		

	}

	@Test(priority = 2)
	public void SignIn() {

		WebElement Login = driver.findElement(By.xpath("//ul[@class='header links']/li[2]/a"));
		Login.click();
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("iamher12390@gmail.com");
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("@abdallah@123");
		
		WebElement SignInButton=driver.findElement(By.name("send"));
		SignInButton.click();
	}

	@AfterTest
	public void Final() {

	}
}
