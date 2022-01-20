package ais_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CocoDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/SYNC2021/Downloads/coco/index.html#");
		
		String actualTitle=driver.getTitle();
		String expectTitle ="COCO_Fashion.";
		
		if(actualTitle.equals(expectTitle)) {
			System.out.println("we are COCO_Fashion page");
		}
		else {
			System.out.println("we are no COCO_Fashion page");
		}
		
		//home
		WebElement target=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
		Actions act=new Actions(driver);
		
		act.moveToElement(target).perform();
		Thread.sleep(5000);
		
		WebElement Home2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[2]/a"));
		act.click(Home2).perform();
		Thread.sleep(5000);
		
		WebElement target1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
		act.moveToElement(target1).perform();
		Thread.sleep(5000);
		
		
		WebElement Home3=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[3]/a"));
		act.click(Home3).perform();
		Thread.sleep(5000);
		
		WebElement target11=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
		act.moveToElement(target11).perform();
		Thread.sleep(5000);
		
		WebElement Home4=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[4]/a"));
		act.click(Home4).perform();
		Thread.sleep(5000);
		
		WebElement target111=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
		act.moveToElement(target111).perform();
		Thread.sleep(5000);
		
		WebElement Home5=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[5]/a"));
		act.click(Home5).perform();
	
		
		//ABOUT US
		Navigation nav=driver.navigate();
		nav.to("file:///C:/Users/SYNC2021/Downloads/coco/index-2.html");
		
		//noteActions act=new Actions(driver);
		
		//WebElement target2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		//act.moveToElement(target2).perform();
		driver.findElement(By.linkText("ABOUT US")).click();
		Thread.sleep(5000);
		nav.back();
		
		//SHOP
		
		//nav.to("file:///C:/Users/SYNC2021/Downloads/coco/index-2.html");
		WebElement target3=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a"));
		act.moveToElement(target3).perform();
		Thread.sleep(5000);
		
		//PAGES
		nav.back();
		WebElement target4=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
		act.moveToElement(target4).perform();
	 	
		WebElement shop_List=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/ul/li[1]/a"));
		act.click(shop_List).perform();
		Thread.sleep(5000);
		
		WebElement target41=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
		act.moveToElement(target41).perform();
		
		WebElement shop_Grid=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/ul/li[2]/a"));
		act.click(shop_Grid).perform();
		Thread.sleep(5000);
		
		WebElement target411=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
		act.moveToElement(target411).perform();
		Thread.sleep(2000);
		
		WebElement Blog=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/ul/li[3]/a"));
		act.click(Blog).perform();
		Thread.sleep(5000);
		
		WebElement target42=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
		act.moveToElement(target42).perform();
		Thread.sleep(2000);
		
		WebElement single_blog=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/ul/li[4]/a"));
		act.click(single_blog).perform();
		Thread.sleep(5000);
		
		WebElement target43=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
		act.moveToElement(target43).perform();
		Thread.sleep(2000);
		
		WebElement Checkout=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/ul/li[5]/a"));
		act.click(Checkout).perform();
		Thread.sleep(5000);
		
		WebElement target44=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
		act.moveToElement(target44).perform();
		Thread.sleep(2000);
		
		WebElement Shopping_card=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/ul/li[6]/a"));
		act.click(Shopping_card).perform();
		Thread.sleep(5000);
		
		WebElement target45=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
		act.moveToElement(target45).perform();
		Thread.sleep(2000);
		
		WebElement Product_details=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/ul/li[7]/a"));
		act.click(Product_details).perform();
		Thread.sleep(5000);
		
		WebElement target46=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
		act.moveToElement(target46).perform();
		Thread.sleep(2000);
		
		WebElement Contact_Us=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/ul/li[8]/a"));
		act.click(Contact_Us).perform();
		Thread.sleep(5000);
		
		WebElement target47=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
		act.moveToElement(target47).perform();
		Thread.sleep(2000);
		
		WebElement About_us=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/ul/li[9]/a"));
		act.click(About_us).perform();
		Thread.sleep(5000);
	
	//contact us
		WebElement target5=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[5]/a"));
		act.moveToElement(target5).perform();
	
		driver.findElement(By.linkText("CONTACT US")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("BLOG")).click();
		Thread.sleep(5000);
	}
	

}
