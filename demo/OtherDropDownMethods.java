package demo;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OtherDropDownMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		 Select sel =new Select(country);
		 List<WebElement>alloptions=sel.getOptions();
		 
		int count=1;
		 for(WebElement op:alloptions) {
			 System.out.println(count+"."+op.getText());
			 count++;
		 }
		 TreeSet<String> test = new TreeSet<String>();
		 
		 for(WebElement op:alloptions) {
			 test.add(op.getText());
			 
			 System.out.println("--------------------------------");
			 
			  Iterator<String>textOptions=test.iterator();
		     count=1;
		     while(textOptions.hasNext()) {
		    	 System.out.println(count+"."+textOptions.next());
		    	 count++;
		     }
			 
		 }
		 
	/*	 //month
		 WebElement BOM =driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
			Select sel1= new Select(BOM);
		    sel1.selectByVisibleText("FEB");
			
		  List<WebElement>alloptions1=sel1.getOptions();
			int count1=1;
			for(WebElement op:alloptions);{
				System.out.println(count1+"."+op.getText());
				count1++;
			}    */
		 
		 
		 WebElement city=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
		 Select sel1 =new Select(city);
		 List<WebElement>alloptions1=sel1.getOptions();
		 
		int count1=1;
		 for(WebElement op:alloptions1) {
			 System.out.println(count1+"."+op.getText());
			 count1++;
	}
 TreeSet<String> test1 = new TreeSet<String>();
		 
		 for(WebElement op:alloptions) {
			 test1.add(op.getText());
			 
			 System.out.println("--------------------------------");
			 
			  Iterator<String>textOptions=test1.iterator();
		     count=1;
		     while(textOptions.hasNext()) {
		    	 System.out.println(count+"."+textOptions.next());
		    	 count++;
		     }
			 
		 }
	
}
}

