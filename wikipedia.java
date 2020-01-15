package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
public class wikipedia {

	public static void main(String[] args)throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver-v78\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
				driver.get("https://pl.wikipedia.org/wiki/Wikipedia:Strona_główna");
				driver.findElement(By.id("searchButton")).click();
				driver.findElement(By.name("go")).click();
				driver.findElement(By.className("searchButton")).click();
				driver.findElement(By.xpath("//input[@id='searchButton']")).sendKeys(Keys.ENTER);
				driver.findElement(By.cssSelector("#searchButton")).click();
				driver.findElement(By.linkText("Losuj artykuł")).click();  // brak lineText w przycisku wyszukiwarki
				driver.findElement(By.partialLinkText("Losuj artyk")).click(); // brak partialLineText w przycisku wyszukiwarki
				driver.findElement(By.tagName("Przejdź do strony o dokładnie takim tytule, o ile istnieje")).click();
				Thread.sleep(2000);
				driver.close();
				driver.quit();
	}

}
