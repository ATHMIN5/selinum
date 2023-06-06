package athm.d7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D8P5
{
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver1=new ChromeDriver(co);
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com");
		driver1.findElement(By.name("q")).sendKeys("Apple");
		driver1.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver1.getTitle());												
	}
}
