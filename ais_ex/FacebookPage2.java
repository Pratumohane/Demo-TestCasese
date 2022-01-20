package ais_ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPage2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQwMjY4MDA3LCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		
		/*String actualTitle=driver.getTitle();
		String expectedTitle="facebook";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("we are on facebook page");
		}
		else {
			System.out.println("we are not facebook page");
		}*/
		
		List<WebElement>inputbox=driver.findElements(By.tagName("input"));
		
		inputbox.get(2).sendKeys("yash");
		inputbox.get(3).sendKeys("mohane");
		inputbox.get(4).sendKeys("8767726311");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("veer@@vee");
		
		//day
		 WebElement Bir_day= driver.findElement(By.xpath("//*[@id=\"day\"]"));
		 Select sel=new Select(Bir_day);
		 sel.selectByIndex(7);
		 
		 List<WebElement>alloptions=sel.getOptions();
		  int count=1;
		 for(WebElement op:alloptions) {
			 System.out.println(count+"."+op.getText());
			 count++;
		 }
		 //month
		 WebElement Bir_month=driver.findElement(By.xpath("//*[@id='month']"));
		 Select sel1=new Select(Bir_month);
		 sel1.selectByValue("9");
		 
		 List<WebElement>alloptions1=sel1.getOptions();
		 int count1=1;
		 for(WebElement op1:alloptions1) {
			 System.out.println(count1+"."+op1.getText());
			 count++;
		 }
		 //year
		 
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		 Select sel11= new Select(year);
		 sel11.selectByValue("1995");
		 
		 List<WebElement>alloptions11=sel11.getOptions();
		 int count11=1;
		 for(WebElement op:alloptions11) {
			 System.out.println(count11+"."+op.getText());
		 }
		 
		//geneder
	driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		 
		driver.findElement(By.tagName("button")).click();
	}

}
