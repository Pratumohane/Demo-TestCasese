package demotesting;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SoftAssertion {
	WebDriver driver;
	SoftAssert sa;
	String expTitle="rediff";
	
  @Test()
  public void login() {
	  
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  sa=new SoftAssert();
	  sa.assertEquals(driver.getTitle(),expTitle);
	  driver.findElement(By.name("login")).sendKeys("Selenium");
		driver.findElement(By.id("password")).sendKeys("Selenium");
		driver.findElement(By.className("signinbtn")).click();
	  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
	  driver =new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  sa.assertAll();
	  driver.close();
  }

}
