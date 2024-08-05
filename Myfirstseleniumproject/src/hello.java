import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hello 
{
public static void main(String[]args) {
//  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manali\\Downloads\\driver\\chromedriver.exe");
//	WebDriverManager.chromedriver().setup();
	
//	WebDriver driver =new ChromeDriver();// for launching browser
	
	
	WebDriver driver=WebDriverManager.chromedriver().create();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	 
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("aishli_pardhi");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aishli@98");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	driver.close();
}

}
