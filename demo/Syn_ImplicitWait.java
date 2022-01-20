package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 //synchronization is concept where two or more software 
   works parallel if one software or tool work fast and other work
   slow there will be expection
   
   
  //Unconditional and conditionalSynchronization
  
  //Unconditional synchronization example thread.sleep(long mills)stop
    jvm certain amount,disadvantage unnecessary waiting
    
   //conditional synchronization can be achived in two way implicit and explicit
    
   //Implicit wait will apply for entire webpage or for all webelement
    
   //Implicit wait default time is 0
    
   //If element is not founded in within specified time below 30 second it will throw expection
    
    //Done use Implicit and explicit together   
 * 
 */
public class Syn_ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		//Implicit wait will apply for entire webpage or for all webelement 
		//Implicit wait default t6ime is 0
		//if element is not founded in within specified time below 30 second it will throw expection
		//Donot use Implicit and explicit together
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='allow']")).click();
		
	}

}
