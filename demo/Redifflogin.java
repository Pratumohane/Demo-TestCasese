package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogin {
       
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 driver.findElement(By.name("login")).sendKeys("Selenium");
		 driver.findElement(By.id("password")).sendKeys("Selenium");
         driver.findElement(By.className("signinbtn")).click();

	}

}
