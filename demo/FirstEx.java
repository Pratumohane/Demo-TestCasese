package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * public :access modifier which give access to JVM
 * static: keyword which give access to entire class 
 * void: it return nothing
 * main(String[]args): method name which take argument of String of array
 * 
 * 
 * 
 */

public class FirstEx {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		
		//this is key word for chromedriver "webdriver.chrome.driver"
		//this is path of chromedriver.exe".//lib//chromedriver.exe"
		//This will set up chromedriver.exe it will communicate directly browser
		//webdriver driver=new webDriver();//this way
		//we cannot creat object of interface
		//ChromeDriver driver=new ChromeDriver();
		//ChromeDriver is class
		//This is correct way of lainching chrome browser but not preffered way
		
		driver= new ChromeDriver();
		
		//WebDriver(parent) is interface driver is refrence object or refrence variable
		//new is key word which instialize chromeDriver(child)class
		//This is correct way of launching chrome browser and preffered way
		//to achive runtime polymorphism
		//Driver FirefoxDriver();
		//webDriver(parent)is interface driver is refrence object or refrence variable
		//new is key word which intialize FirefoxDriver(child)class
		//This is correct way of launching firefox browser and preffered way
		//to achive runtime polymorphism
		
		 System.out.println(7);
	}

}
