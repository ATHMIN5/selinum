package athmi.a2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open chrome
				WebDriverManager.chromedriver().setup();
		    	ChromeOptions co=new ChromeOptions();
		    	co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(co);
				driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
				driver.manage().window().maximize();
		
		try {
			driver.findElement(By.className("form-check-inp")).click();
		} 
		catch (NoSuchElementException   e) {
			// TODO Auto-generated catch block
			System.out.print("Element Not found sorry");
			//throw e;
		}
	}

}
