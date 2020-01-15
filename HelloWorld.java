package testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		// Google Chrome 
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver-v78\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.pl/");
		driver.findElement(By.name("q")).sendKeys("Hello webdriver |!|");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);

		//driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
		
	Thread.sleep(2000);
		driver.close();
		driver.quit();

	

		

	
	}

}
