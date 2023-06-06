package athm.d7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class D7P1 {
	WebDriver driver;
  @BeforeTest
  public void a() 
  {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get("https://www.google.com");
  }
  @Test
  public void b()
  {
	  String txt=driver.getTitle();
	  System.out.println(txt);
	  Assert.assertEquals(txt,"Google");
  }
  @AfterTest
  public void c()
  {
	  driver.quit();
  }
}
