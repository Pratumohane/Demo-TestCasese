package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Meesho {
	 WebDriver driver ;
     String parentWinId;
     
  @Test(priority=-1)
  public void When_guest_user_open_chrome() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
      driver = new ChromeDriver();
     
      driver.manage().window().maximize();
     
      driver.get("https://meesho.com/");
      Thread.sleep(5000);
     
  }
  
  @Test(priority=0)
  public void Then_search_kurti () throws InterruptedException
  {
	  driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("kurti",Keys.ENTER);
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div[3]/div/div[1]/a/div/div[1]/div[1]/img")).click();
  }
  
  @Test(priority=1)
  public void Then_Add_To_Cart() throws InterruptedException
  {
		      Set<String> allWin = driver.getWindowHandles();
		      for(String win : allWin) {
		              if(!win.equals(parentWinId))
		              {
		                      driver.switchTo().window(win);
		              }
		        }
		      driver.findElement(By.xpath("//*[@class=\'SingleChip__StyledChip-sc-oqewox-0 gAAUDP\']")).click();
		      Thread.sleep(1000);
		      driver.findElement(By.xpath("//*[@class=\"BaseButton__ButtonWrapper-sc-1e0kf5s-1 gzqhEM\"]")).click();
		      
		   		      }
  @Test(priority=2)
  public void then_give_OTP() {
	  
  }
  
  @Test(priority = 2)
  public void Click_PlaceOrder() throws InterruptedException {
          Thread.sleep(5000);
          driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
          String v = driver.getTitle();
          System.out.println(v);
  }
  
  @Test(priority = 2)
  public void Verify_Login_Page() {
         
Assert.assertEquals(driver.getTitle(), "");                
}
 
  }
  

