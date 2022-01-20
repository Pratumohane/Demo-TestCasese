package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFramWithinFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		
	
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
	
		//it will switch to first frame which of match webelement 
		WebElement outerFrame=driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/iframe[1]"));
		driver.switchTo().frame(outerFrame);
		
		WebElement innerFrame=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/iframe[1]"));
		
		driver.switchTo().frame(innerFrame);
		
		
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Selenium");

		
	}

}