package demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyPageSource {

	public static void main(String[] args) throws IOException {
       
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		 String source=driver.getPageSource();
		 
		  
		 
	 FileWriter fw=new FileWriter(".//Files//src.txt");
		 fw.write(source);
		 fw.close();
		 
		File file1= new File(".//Files//src.txt");
		 File file2= new File(".//Files//expsrc.txt");
		 
		 file1.compareTo(file2);
		 }
	}


