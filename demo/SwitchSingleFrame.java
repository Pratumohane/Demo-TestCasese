package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchSingleFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		List<WebElement> allFrame=driver.findElements(By.tagName("iframe"));
		System.out.println(allFrame.size());
		
		//it will switch to first frame which is available
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Selenium");


	}

}
