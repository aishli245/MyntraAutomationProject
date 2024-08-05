import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	static void selectMonthAndYear(WebDriver driver, String month, String year)
	{
		//select month and year
		
				while(true)
				{
					String currentMonth=driver.findElement(By.xpath("//input[@id='datepicker-month']")).getText();
					String currentYear=driver.findElement(By.xpath("//input[@id='datepicker-year']")).getText();
					
					if(currentMonth.equals(month) && currentYear.equals(year))
					{
						break;
					}
					
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// Next Butto n	
				}
	}
	
	// select the date
	
	static void selectDate( WebDriver driver, String date)
	{
		
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calender']//tbody//tr/td//a"));
					for(WebElement dt:allDates)
					{
						if(dt.getText().equals(date))
						{
							dt.click();
							break;
						}
					}
		}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Switch to frame
		driver.switchTo().frame(0);
		
		
		//Method1 : using sendkeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/08/2024");
		
		
		//Method2 : expected data using date picker
		String year="2025";
		String month="January";
		String date="16";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		 
		selectMonthAndYear(driver,month,year);
		selectDate(driver,date);
	}

}
