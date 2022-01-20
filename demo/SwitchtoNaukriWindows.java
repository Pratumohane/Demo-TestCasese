package demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoNaukriWindows {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  
	  //Store parent or main session id of this driver instance in string
	  
	  String parentWinId=driver.getWindowHandle();
	  System.out.println("Parent ID:"+parentWinId);
	  
	  //Strore all session id of this driver instance in Set<String>
	  
	  Set<String>allWinId=driver.getWindowHandles();
	  
	  //closing all popup windows expect parent window
	/*  for(String win:allWinId) {
		  if(!win.equals(parentWinId)) {
			  driver.switchTo().window(win);
			  
			  driver.close();
		  }
	  }  */
	  
	  //driver.switchTo().window(parentWinId);
	  
	  //swich to pop window and maximize and browser and print title of webpage
	  
	  /*
	  for(String win:allWinId) {
		  
		  if(!win.equals(parentWinId)) {
			
			  driver.switchTo().window(win);
			  
			  driver.manage().window().maximize();
			  }
	  }
	  
	  System.out.println(driver.getTitle());
	}
 
	*/
	  
	  //switch to all window and if title if that page is"Tech Mahindra" maximize and browser
	  for(String win:allWinId)
	  {
		  driver.switchTo().window(win);
		  
		  if(driver.getTitle().equals("Tech Mahindra")) {
			  
			  driver.manage().window().maximize();
		  }
	  }
}
}
