package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		//tagName:referred w3school for all tags
				//a-(hyperLink),input-(text,radio,checkbox)
				//button
				//tr-table row, td-table data 
		
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		int count=1;
		for(WebElement link:allLinks)
		{
			System.out.println(count+"."+link.getText());
			count++;
		}
	}

}
