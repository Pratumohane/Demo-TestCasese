package demo;

/*
 * To control complex user gexture in selenium api there is class called as Actions which 
 * control mouse and keyboard api
 * 
 * The user-facing API for emulating complex user gestures. Use this class rather than using the Keyboard or 
 * Mouse directly.
Implements the builder pattern: Builds a CompositeAction containing all actions specified by the method calls.

Call perform() at the end of the method chain to actually perform the actions.
 * 
 * 
 *  
 *  Actions is class which has parameterized constructor which take argument of Webdriver reference driver 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeybordEvent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement target = driver.findElement(By.xpath("//input[@name='q']"));

		Actions act = new Actions(driver);
		
        act.sendKeys(target,"New year greeting 2022").perform();
        Thread.sleep(5000);
        
        for(int i=0;i<5;i++){
        	  Thread.sleep(5000);
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        }
        
        for(int i=0;i<2;i++)
        {
        	Thread.sleep(2000);
        	act.sendKeys(Keys.ARROW_UP).perform();
        }
		
        act.sendKeys(Keys.ENTER).perform();
        
        //copy text of textbox or text area 
        //act.sendKeys(target,kyes.CONTROL+"c");
        
        //pass text in textbox or text area 
        //act.sendKeys(target,Keys.CONTROL+"v");
	}

}
