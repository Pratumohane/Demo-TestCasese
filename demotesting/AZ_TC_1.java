package demotesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;



public class AZ_TC_1 {
	
	WebDriver driver;
	String ParentWinId;
	// priority takes only real integer -ve has highest priortity
	// Default value is zero

	@Test(priority = -1)
	public void When_guest_user_open_chrome() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		ParentWinId = driver.getWindowHandle();
	}

	@Test(priority = 0)
	public void then_search_oneplus_9r() {
		
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus_9r",Keys.ENTER);
	driver.findElement(By.xpath("//span[contains(text(),'OnePlus 9R 5G (Carbon Black, 8GB RAM, 128GB Storag')]")).click();
		
	}

	@Test(priority = 1)
	public void Then_click_Buy_Now() {
	
		Set<String> allWin=driver.getWindowHandles();
		for(String win: allWin) {
			if(!win.equals(ParentWinId))
			{
				driver.switchTo().window(win);
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
	
	}
	

	@Test(priority = 2)
	public void Click_checkoutprocess() {
	System.out.println("continue with checkout process");
		}
		
	@Test(priority = 3)
	public void Then_validate_login_page_is_opened_or_Not() {
		
		Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
	
		

	}

}