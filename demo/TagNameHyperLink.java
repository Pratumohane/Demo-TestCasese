package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameHyperLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		  // WebElement forgotPass=driver.findElement(By.partialLinkText("word?"));
         //  List<WebElement>allLinks=driver.findElements(By.tagName("a"));
         
           List<String>allcountry= countryName("india","srilanka","bhutan");
           for(String s:allcountry) {
        	 System.out.println(s);
           }
           System.out.println(allcountry.size());
           
           System.out.println(allcountry.get(3));
	}
	public static List<String>countryName(String s1,String s2,String s3)
	{
		List<String>allList = new ArrayList<>();
		allList.add(s1);
		allList.add(s2);
		allList.add(s3);
		
		return allList;
		
		
	}

	 

}
