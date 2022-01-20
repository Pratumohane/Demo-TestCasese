package demo;

/*
 * public interface webElement extend SearchContext,TakeScrreenshot Represents an HTML element. Generally,all interesting operations to do with interactinf with a page will be
 * performed through this interface.
 * All method call will do a freshness check to ensure that the element reference is still valid.
 * This essentially determines whether or not the element is still attached to the DOM.
 *  If this test fails,than an 
 *  StaleElementreferenceException is throw, and all future call to this
 *  instance will fail.
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {

	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		//Select is class in selenium support ui package help to perform event  on dropdown 
		//Select class has paramertized constructor which take argument of webelement reference 
		Select sel=new Select(country);
		
		boolean flag=sel.isMultiple();
		System.out.println("Can we select multiple options in dropdown:"+flag);
		
		
		sel.selectByIndex(10);
		
		Thread.sleep(5000);
		
		sel.selectByVisibleText("Bhutan");
		
		Thread.sleep(5000);
		
		sel.selectByValue("56");
		
		
	
	}

}
