package demo;

/*Alert or javascript or window alert is information display or some warning are 
* display to end user which as guidance in application 
* Three types of alert
* 1.Simple Alert:-We can accept(ok) the information 
* 2.Confirm Alert:-We can either accept(ok) or dissmiss() information displayed
* 3.prompt Alert:-We can provide input in form text and We can either accept(ok) or dissmiss() information displayed
* 
* 
* To handle this type of alert or window alert in selenium there is interface 
* called Alert interface 
* Alert there are are four methods
* 1.accept()-click ok
* 2.dissmiss()-click cancel
* 3.getText()-extract information and return in String
* 4.SendKeys(Sting arg0):-Send text in alert text box 
* 
* */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		
		try {
		Alert alert=driver.switchTo().alert();
		
		String actText=alert.getText();
		String expText="I am an alert box!";
		
		/*if(actText.equals(expText)) {
			System.out.println("yellow box Testing passed:");
		}
		else {
			System.out.println("yellow box testing failed:");
		}*/
		
		Thread.sleep(5000);
		alert.accept();
		
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			
		}
		

	}

}
