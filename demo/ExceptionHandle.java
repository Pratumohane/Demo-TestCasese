package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandle {

	public static void main(String[] arg){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone+13+");
		//To handle any selenium expection like NoSuchElement,StaleElement,not clickable,....Can be handled using for loop 
		while (true) {
			try {

				for (int i = 0; i < 10; i++) {

					if (driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed()) {
						driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
						break;
					}
					else {
						continue;
					}  
				}

			} catch (Exception e) {
				break;

			}

		}

	}

}