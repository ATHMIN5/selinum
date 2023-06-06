package athm.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registertest
{
	public static WebElement gender(WebDriver driver)
	{return driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));}
	public static WebElement fname(WebDriver driver)
	{return driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));}

	public static WebElement lname(WebDriver driver)
	{return driver.findElement(By.xpath("//*[@id=\"LastName\"]"));}

	public static WebElement email(WebDriver driver)
	{return driver.findElement(By.xpath("//*[@id=\"Email\"]"));}

	public static WebElement pwd(WebDriver driver)
	{return driver.findElement(By.xpath("//*[@id=\"Password\"]"));}

	public static WebElement confirmpwd(WebDriver driver)
	{return driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));}

	public static WebElement registerbtn(WebDriver driver)
	{return driver.findElement(By.xpath("//*[@id=\"register-button\"]"));}
}
