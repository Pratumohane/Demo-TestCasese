package demo;
/*
 * To control user gexture in selenim api there is class called as Actions witch
 * control mouse and keybord api
 * 
 * Action is class has parameterrized constractor witch take aegument of webdriver referance drive
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEvent {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americangolf.co.uk/");
		
		WebElement target=driver.findElement(By.xpath("//*[@id=\'header-navigation\']/div[1]/ul/li[4]/a"));
		Actions act=new Actions(driver);
		//moveToElement(webelement) perform mouse hover event webElement
		act.moveToElement(target).perform();
		
		Thread.sleep(5000);
		
		WebElement putter= driver.findElement(By.xpath("//*[@id=\'wrapper\']/div[1]/div[1]/ul/li[2]/ul/li[5]/div/div/ul/li[3]/ul/li/a/span)"));
		//click(webElement) perform mouse click event on webelement
		act.click(putter).perform();
	}

}
