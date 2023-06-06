package athmi.a2;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// open chrome
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		
		//implicit wait command for 10 secs
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
		
		//getting title and comparing
		String t1="Purchase a Gift Certifice";
		String t2="";
		t2=driver.getTitle();
		if(t1.equals(t2))
		{
			System.out.println("Pass");
		}
		else {System.out.println("Fail");}
	}

	}


