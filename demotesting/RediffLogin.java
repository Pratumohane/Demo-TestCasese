package demotesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RediffLogin {
	
	WebDriver driver;
  @Test(invocationCount=3)
  public void login() {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.name("login")).sendKeys("selenium");
	  driver.findElement(By.id("password")).sendKeys("sele@123");
	  driver.findElement(By.className("singinbtn")).click();
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
	  driver =new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
