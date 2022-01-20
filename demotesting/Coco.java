package demotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Coco {
	
	WebDriver driver;
	
  @Test(priority = -1)
  public void When_guest_user_open_chrome(){
	  System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("C:/Users/SYNC2021/Downloads/coco/index.html");
  }	
	  @Test(priority = -1)
	  public void then_search_watch(){
		  
		  driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/ul/li[2]/a")).click();
		  
  }
  
  
}
