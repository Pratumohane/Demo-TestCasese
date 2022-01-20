package testng;


import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mintra {
	WebDriver driver;
	String parentWinId;
	ChromeOptions options;

	@Test
	public void When_guesr_user_open_mintra(){

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver =new ChromeDriver(options);

		driver.get("https://www.myntra.com/");
		parentWinId = driver.getWindowHandle();
	}

	@Test(dependsOnMethods="When_guesr_user_open_mintra")
	public void then_search_Casual_Shoes() 
	{
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Casual Shoes",Keys.ENTER);
	}

	@Test(dependsOnMethods="then_search_Casual_Shoes")
	public void Then_click_Product() 
	{
		driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[2]/section/ul/li[2]/a/div[1]/div/div/div/picture/img")).click();
	}

	@Test(dependsOnMethods="Then_click_Product")
	public void Then_click_WISHLIST() throws InterruptedException 
	{
		Set<String> allWin =	driver.getWindowHandles();
		for(String win : allWin) {
			if(!win.equals(parentWinId))
			{
				driver.switchTo().window(win);
			}
		}

		Thread.sleep(5000);
		try {
			WebElement wishlist=  driver.findElement(By.xpath("//span[contains(text(),'WISHLIST')]"));
			if(wishlist.isDisplayed())
			{
				wishlist.click();
			}	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


	@Test(dependsOnMethods="Then_click_WISHLIST") 
	public void click_ckeckoutprocess() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.close();

	}

}



