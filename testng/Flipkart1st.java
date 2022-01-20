package testng;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Flipkart1st {

	  WebDriver driver ;
      String parentWinId;

      // priority takes only real integer negativee has highest priortity
      // Default value is zero

      @Test(priority = -1)
      public void When_guest_user_open_chrome() throws InterruptedException {
              System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
              driver = new ChromeDriver();
             
              driver.manage().window().maximize();
             
              driver.get("http://www.flipkart.com");
              Thread.sleep(5000);
              driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
          parentWinId = driver.getWindowHandle() ;
     
         }

      @Test(priority = 0,invocationCount=3)
      public void Then_search_RedmiNote_9 () throws InterruptedException {
              driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Redmi Note 9",Keys.ENTER);
              Thread.sleep(5000);
              driver.findElement(By.xpath("//div[contains(text(),'REDMI Note 9 (Pebble Grey, 64 GB)')]")).click();
  }

      @Test(priority = 1)
      public void Then_Add_To_Cart() {
      Set<String> allWin =        driver.getWindowHandles();
      for(String win : allWin) {
              if(!win.equals(parentWinId))
              {
                      driver.switchTo().window(win);
              }
        }
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
      }

      @Test(priority = 2)
      public void Click_PlaceOrder() throws InterruptedException {
              Thread.sleep(5000);
              driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
              String v = driver.getTitle();
              System.out.println(v);
  }
     
      @Test(priority = 3)
      public void Verify_Login_Page() {
             
  Assert.assertEquals(driver.getTitle(), "Flipkart.com: Secure Payment: Login > Select Shipping Address > Review Order > Place Order");                
  }
     

}