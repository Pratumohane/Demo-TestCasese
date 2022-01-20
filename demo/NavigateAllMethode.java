package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Driver.navigate() navigate is methode in webdriver which return navigation interface
 *  navigation interface controls navigation bar in browser 
 *  there 4 methods in navigation interface
 *  1. to (string arg()) it perform like get (String arg()) thats loading new webpage in 
 current browser wondow but only difference that when we use to (String arg()) it store history of browsing
 
 *  2. back(): goning back to previous histry
 *  3. farward(): goning forward to previous history
 *  4. refresh():  
 * 
 * 
 */

public class NavigateAllMethode {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
       Navigation nav= driver.navigate();
       nav.to("https://www.rediff.com");
       
       driver.findElement(By.linkText("Rediffmail")).click();
       
       Thread.sleep(10000);
       nav.back();
       
       Thread.sleep(10000);
       nav.forward();
       Thread.sleep(10000);
       
       driver.findElement(By.id("login1")).sendKeys("pratiksha");
       
       Thread.sleep(10000);
       nav.refresh();
	}
}