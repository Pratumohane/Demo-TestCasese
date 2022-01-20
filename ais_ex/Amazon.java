package ais_ex;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Navigation nav=driver.navigate();
		  Actions act = new Actions(driver); 
		  
	/*
     String actualTitle=driver.getTitle();	
     String explectTitle="amazon.in";
     
     if(actualTitle.equals(explectTitle)) {
    	 System.out.println("we are amazon page");
    	 
     }else {
    	 System.out.println("we are no amazon page");
     }
     
     //location
     
  //driver.findElement(By.id("glow-ingress-line2")).click();
  
   //driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("100001");
     //driver.findElement(By.className("a-buttob-input")).click();
     Actions act = new Actions(driver); 
     
    
     
   
     driver.findElement(By.xpath("//*[@id=\"nav-search-dropdown-card\"]/div")).click();
     for(int i=0;i<9;i++)
     {
    	 Thread.sleep(2000);
    	 act.sendKeys(Keys.ARROW_DOWN).perform();
     }
     act.sendKeys(Keys.ENTER).perform();
    
   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("liner");
   for(int i=0;i<5;i++) {
	   Thread.sleep(1000);
	   act.sendKeys(Keys.ARROW_DOWN).perform();   }
   
   driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
   nav.back();
   */
   
   //alert
  // driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
   
 
 // WebElement target=driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[1]/span[1]/span[2]/span[1]"));
//  act.moveToElement(target).perform();
  
   //driver.findElement(By.xpath("//*[@id='nav-flyout-icp']/div[2]/a[7]/span/span[1]")).click();
  
  //nav.back();
  
  WebElement target=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
  act.moveToElement(target).perform();
  Thread.sleep(2000);
  
  WebElement wish_list=driver.findElement(By.xpath("//*[@id=\'nav-al-your-account\']/a[3]/span"));
  act.click(wish_list).perform();
  
  nav.back();
  
  driver.findElement(By.xpath("//*[@id=\"nav-orders\"]")).click();
  Thread.sleep(2000);
  nav.back();
  
  driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
	}

}
