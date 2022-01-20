package demo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotRediffmail {

	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
         driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
         
       //TakesScreenshot is intrface implementating in chromedriver.filefoxdriver class
       //((TakesScreenShot)driver) typecasting webdriver driver reference
       //getScreenshotAs(outputType.FILE) is method of Takesscreenshot
        
         int day=LocalDateTime.now().getDayOfMonth();
         int month=LocalDateTime.now().getMonthValue();
         int year=LocalDateTime.now().getYear();
         int hour=LocalDateTime.now().getHour();
         int min=LocalDateTime.now().getMinute();
         
         String fileName=day+"-"+month+"-"+year+" "+hour+""+min;
         
        File from=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File to=new File(".//Files//"+fileName+".png");
        FileHandler.copy(from, to);


	}

}
