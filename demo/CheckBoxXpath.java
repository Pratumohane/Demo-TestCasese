package demo;

/*
 * xpath: is extensible markup language is used for storing and transfering data from aclient to machine/server
 * xpath: extensible path which helps us to locate and navigate within XML orDOM
 * Two of xpath 1. Abusoulte ans 2.Relative 
 * 1.Absoult xpath start from root node(html) begin with single slash / it not preferred for lacating webelement
 * 
 * Ex: /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]
 * 
 * 2. Relative xpath:
 * start from middle of dom begin with double slash // most popular way for locating webelement
 * Syntax: //tagName[@attribute='attribute value']
 * //*[@attribute="attribute value"]
 * 
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");

		//driver.findElement(By.xpath("//input[@name='option3']")).click();
		
		List<WebElement>chkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement c:chkbox)
		{
			//c.click();
			if(!c.isSelected())
			{
				c.click();
			}
			
		}
	}
}


