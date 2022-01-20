package ais_ex;





import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {



	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//city
		WebElement city=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
		 Select sel11 =new Select(city);
		 List<WebElement>alloptions11=sel11.getOptions();
		 
		int count11=1;
		 for(WebElement op:alloptions11) {
			 System.out.println(count11+"."+op.getText());
			 count11++;
	}
		 

			//geneder
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		
		//day
		WebElement BOD =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select sel= new Select(BOD);
		sel.selectByIndex(22);
		
		List<WebElement>alloptions=sel.getOptions();
		int count=1;
		for(WebElement op:alloptions) {
			System.out.println(count+"."+op.getText());
			count++;
		}
		
		
		//month
		WebElement BOM =driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
		Select sel111= new Select(BOM);
	    sel111.selectByVisibleText("FEB");
		
	    List<WebElement>alloptions1=sel111.getOptions();
		 
			int count1=1;
			 for(WebElement op:alloptions1) {
				 System.out.println(count1+"."+op.getText());
				 count1++;
		}
			 
			 //year
			 WebElement DOY=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
			 Select sel1111 =new Select(DOY);
			 //sel1111.selectByIndex(2000);
			 
			 List<WebElement>alloptions111=sel1111.getOptions();
			 
			int count111=1;
			 for(WebElement op:alloptions111) {
				 System.out.println(count111+"."+op.getText());
				 count111++;
		}
	 
			 //contry code
				WebElement code= driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[2]/div[1]"));
				Select sel11111=new Select(code);
				
				 List<WebElement>alloptions1111=sel11111.getOptions();
				 
					int count1111=1;
					 for(WebElement op:alloptions1111) {
						 System.out.println(count1111+"."+op.getText());
						 count1111++;
		
		    }
	
	}
	

}
