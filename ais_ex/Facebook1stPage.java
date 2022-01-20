package ais_ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1stPage {

	private static WebDriver inputbox;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualTitle =driver.getTitle();
		String expectedTitle="facebook";
		
		if(actualTitle.equals(expectedTitle))
        {
        	System.out.println("we are on facebook page");
        }
        else {
        	System.out.println("we are not facebook page"+driver.getTitle());
        	
        }
		List<WebElement>inputbox=driver.findElements(By.tagName("input"));
		
		inputbox.get(2).sendKeys("govindharode@gmail.com");
		inputbox.get(3).sendKeys("govindharode@gmail.com");
		
		
		//driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		
		driver.findElement(By.tagName("input"));
		
		inputbox.get(1).sendKeys("9370632914");
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(5000);
		//driver.findElement(By.tagName("a"));
		driver.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[3]/div/div[1]/a")).click();
	
		//new page create
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		
	}

}


