package demotesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class DependOnMethod {
	WebDriver driver;
	String parentWinId;

	// priority takes only real integer -ve has highest priortity
	// Default value is zero

	@Test()
	public void When_guest_user_open_chrome() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		parentWinId = driver.getWindowHandle();
	}

	@Test(dependsOnMethods="When_guest_user_open_chrome")
	public void then_search_oneplus_9r() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Oneplus 9r", Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'OnePlus 9R 5G (Carbon Black, 8GB RAM, 128GB Storag')]"))
				.click();

	}

	@Test(dependsOnMethods="then_search_oneplus_9r")
	public void Then_click_Buy_Now() {
		Set<String> allWin = driver.getWindowHandles();

		for (String win : allWin) {
			if (!win.equals(parentWinId)) {
				driver.switchTo().window(win);
			}

		}

		driver.findElement(By.xpath("//*[@id=\'buy-now-button\']")).click();
	}

	
	@Test(dependsOnMethods="Then_click_Buy_Now")
	public void Then_validate_login_page_is_opened_or_Not() {
		
		
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		
		

	}
}