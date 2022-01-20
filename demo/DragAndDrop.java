package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source500=driver.findElement(By.xpath("//*[@id=\'fourth\']/a"));
		WebElement targetDebitAmt=driver.findElement(By.xpath("//*[@id=\'amt7\']/li"));
		
		WebElement targetCreditAmt=driver.findElement(By.xpath("//*[@id=\'amt8\']/li"));
		
		WebElement sourceBank=driver.findElement(By.xpath("//*[@id=\'credit2\']/a"));
		WebElement targetDebitAct=driver.findElement(By.xpath("//*[@id=\'bank\']/li"));
		
		WebElement targetCreditact=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(source500, targetDebitAmt).perform();
		act.dragAndDrop(source500, targetCreditAmt).perform();
		
		act.dragAndDrop(sourceBank, targetDebitAct).perform();
		act.dragAndDrop(sourceBank, targetCreditact).perform();
		
	}

}
