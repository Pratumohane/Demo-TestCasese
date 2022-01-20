package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syn_ExplicitWait {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.naukri.com");
		
		 //Explicitwait is wait which is used for certain condition to be trure then it
		 
		 //is executed
		 
		 //Explicitwait can be chieve in two ways
		 
		 //1.WeDriverWait is class
		 //2.Fluentwait<T>
		 
		 //Both performed same action only differennce fluentwait polls dom after
		 //interval of time 
		 //WebDriverWait is class which parameterized constructor which take two 
		 //argument one time in long
		 //Webdriver driver reference
		 
		 WebDriverWait wt =new WebDriverWait(driver,30); 
		 
		 By locator=By.xpath("//*[@id='allow']");
		 
		 boolean flag=wt.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
		 
		 if(flag) {
			 driver.findElement(locator).click();
		 }else {
			 System.out.println("Element was not founded");
		 }
		   

	}

}
