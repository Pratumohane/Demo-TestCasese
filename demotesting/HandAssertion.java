package demotesting;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HandAssertion {
	WebDriver driver;
	String expTitle="Rediff";
  @Test
 
  public void login() {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	  Assert.assertEquals(driver.getTitle(), expTitle);
		driver.findElement(By.name("login")).sendKeys("Selenium");
		driver.findElement(By.id("password")).sendKeys("Selenium");
		driver.findElement(By.className("signinbtn")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		 driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
