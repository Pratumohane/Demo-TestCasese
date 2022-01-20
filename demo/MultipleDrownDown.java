package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDrownDown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		WebElement cars=driver.findElement(By.xpath("//select[@id='cars']"));
		Select sel= new Select(cars);
		
		boolean flag=sel.isMultiple();
		System.out.println("can we select multiple options in dropdown:"+flag);
		
    /*  sel.selectByIndex(0);
		sel.deselectByVisibleText("Opel");
		sel.deselectByValue("audi");  */
		//to selsct all dropdown value
		
		List<WebElement>alloptions=sel.getOptions();
		for(WebElement op:alloptions)
		{
			op.click();
		}
		Thread.sleep(5000);
		sel.deselectByVisibleText("Audi");
		
		Thread.sleep(5000);
		sel.deselectAll();
		
	}

}
