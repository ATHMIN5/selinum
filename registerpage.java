package athm.page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import athm.Test1.registertest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class registerpage 
{
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		
		registertest.gender(driver).click();
		registertest.fname(driver).sendKeys("Arun");
		registertest.lname(driver).sendKeys("Kumar");
		registertest.email(driver).sendKeys("asderwq@gmail.com");
		registertest.pwd(driver).sendKeys("123456");
		registertest.confirmpwd(driver).sendKeys("123456");
		registertest.registerbtn(driver).click();
		
}
}
