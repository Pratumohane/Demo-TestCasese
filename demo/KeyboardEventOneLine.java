package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventOneLine {

	public static void main(String[] ar) {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement target = driver.findElement(By.xpath("//input[@name='q']"));

		Actions act = new Actions(driver);

		//build composite actions for more than one action
		//perform() perform action on webelement 
		
		act.sendKeys(target, "New year greetings 2022").
		sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ENTER).build().perform();
		

		

	}

}