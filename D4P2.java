package athmin.a1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D4P2 
{
	public static void main(String[] args) throws Exception
	{
				WebDriverManager.chromedriver().setup();
		    	ChromeOptions co=new ChromeOptions();
		    	co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(co);
				driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
		    	js.executeScript("window.scrollBy(0,1000)","");
				WebElement fn= driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
				fn.sendKeys("Arun");
				WebElement ln= driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
				ln.sendKeys("Kumar");
				WebElement em= driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
				em.sendKeys("Kumar@gmail.com");
				WebElement pwd= driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
				pwd.sendKeys("Kumar@1");
				WebElement sub= driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]"));
				sub.click();
	}
}
