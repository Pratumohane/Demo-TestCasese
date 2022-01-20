package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwitchtoWindo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone+13");

		String parentWinId= driver.getWindowHandle();
		
		System.out.println("parent ID:"+parentWinId);
		driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 13 (Midnight, 128 GB)')]")).click();
		
		Set<String>allWinId=driver.getWindowHandles();
		
		for(String win:allWinId) {
			if(!win.equals(parentWinId)) {
				driver.switchTo().window(win);
			}
		}
		String productName=driver.findElement(By.xpath("//span[contains(text(),'APPLE iPhone 13 (Midnight, 128 GB)')]")).getText();
		System.out.println(productName);
	}

}
