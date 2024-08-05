import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Find total no of rows in a table
	    int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//multiple table
		//int rows=driver.findElements(By.tagName("tr")).size();//single table
		System.out.println("Number of rows: "+rows);//7
		
		//no of coloumns in a table
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//driver.findElements(By.tagName("th")).size();
		System.out.println("Number of columns is: " + cols);
		
		//Read data from specific row and column(5th row and 1st col)
		//String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(bookName);
		//read data from all rows and columns
		
		/*for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value+"\t");
			}
			System.out.println();
		}
		*/
		
		//Print book names whose author is mukesh
		
		/*for(int r=2; r<=rows; r++)
		{
			String autherName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(autherName.equals("Mukesh"))
			{
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName+"\t"+autherName);
			}
		}*/
		//Find total price of all books
		int total=0;
		for(int r=2; r<=rows; r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
			
				System.out.println("Total Price of the books:"+total);
		
		}

	}


