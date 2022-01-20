package ais_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/#photo-manager");
		
		/*WebElement sourceDrag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	    WebElement targetDrpped=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    */
	  Actions act =  new Actions(driver);
	  
	  //act.dragAndDrop(sourceDrag, targetDrpped).perform();
	
	//
	WebElement sourceHighTatrass4=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]/img"));
	WebElement targetTrash=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
	
	act.dragAndDrop(sourceHighTatrass4, targetTrash).perform();
	  
	}
	

}
