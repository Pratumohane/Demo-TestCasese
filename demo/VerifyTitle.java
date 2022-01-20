package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver",".//lib//geckodriver.exe");
        
		driver=new ChromeDriver();
        driver.get("https://www.rediff.com/");
        String actualTitle=driver.getTitle();
        String expectedTitle="Rediffmail";
        if(actualTitle.equals(expectedTitle))
        {
        	System.out.println("we are on Redifmail page");
        }
        else {
        	System.out.println("we are not onRediffmail page"+driver.getTitle());
        	
        }
	}


}


