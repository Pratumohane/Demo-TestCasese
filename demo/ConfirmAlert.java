package demo;

/*Alert or javascript or window alert is information display or some waring are
 *display to end user which  as guidance in apllication 
 *three type of alert
 *1. simple Alert:- we can accept (ok) the information
 *2. Confirm Alert:- we can either accept (ok)  or dismiss() information displayed
 *3. Prompt Alert:- We can provied input in from text and we can either accept(0k) or dismiss() information displayed
 * 
 * 
 * 
 * To handle a this type of alert or window alert in selenium there is interface
 * called alert interface 
 * Alert there are four methods
 * 1. accept()-click ok
 * 2.dismiss()-click cancle
 * 3.getText()-extract information and return in String
 * 4. SendKeys(String arg0):-Send text in alert text box
 * 
 * 
 */
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		
		try {
		
			Alert alert=driver.switchTo().alert();
			
			String actText=alert.getText();
			String expText="Press a Button !";
			
			if(actText.equals(expText)) {
				System.out.println("Yellow box Testing passed:"+actText);
			}
			else {
				System.out.println("Yellow box Testing failed:"+actText);
			}
			Thread.sleep(5000);
			
			alert.dismiss();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

	