package ais_ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameInputButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
           driver.get("https://www.facebook.com/");
           
           
           List<WebElement>inputbox =driver.findElements(By.tagName("inp"));
           
           inputbox.get(2).sendKeys("pradipgade@facebook.com");
           inputbox.get(3).sendKeys("pradipgade@facebook.com");
           
           driver.findElement(By.tagName("button")).click();
	}

}
