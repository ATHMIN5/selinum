package athmi.a2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String[] args) {
		// open chrome
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		//open url
		driver.get("https://google.com");
		
		//wait till google search button is enabled
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
		WebElement re=wait.until(ExpectedConditions.elementToBeClickable(By.className("NO89b")));
		driver.findElement(By.className("gNO89b")).submit();
		//driver.quit();
	
	}

}
