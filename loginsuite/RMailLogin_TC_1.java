package loginsuite;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RMailLogin_TC_1 {
   
	WebDriver driver;

	@BeforeMethod
	@Parameters({"browser"})
	public void openbrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".//lib//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else { 
			System.out.println("Incorrect browser");
		}
	
	}
	
	@Test
	@Parameters({"user"})
	public void login(String user) {     
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("login")).sendKeys(user);
		driver.findElement(By.className("signinbtn")).click();
	}
	
	
	 @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
}
	



	/*WebDriver driver;
	@BeforeMethod
	@Parameters({"browser"})
	public void openbrowser(String browser) {

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firebox"))
		{
			System.setProperty("webdriver.gecko.driver",".//lib//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("incorrect browser");
		}
	}
	
  @Test
  @Parameters({"user"})
  public void login(String user) {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.name("login")).sendKeys(user);
	  driver.findElement(By.className("singinbtn")).click();
		
	  }
	  @AfterMethod
	  public void afterMethod() {
		  
		  driver.close();
	  }
  
}*/
