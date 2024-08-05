package Myntraautomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest {

	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manali\\Downloads\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Test
	public void user_enters_username_and_password() {
        try {
            WebElement profile = driver.findElement(By.xpath("//span[@class='desktop-userTitle' and text()='Profile']"));
            Actions action = new Actions(driver);
            action.moveToElement(profile).perform();
            driver.findElement(By.xpath("//a[@class='desktop-linkButton']")).click();

            // Debugging line
            System.out.println("Navigated to login form");

            // Ensure the input field is present
            WebElement mobileNumberInput = driver.findElement(By.xpath("//input[contains(@class,'mobileNumberInput')]"));
            if (mobileNumberInput.isDisplayed()) {
                mobileNumberInput.sendKeys("7389695245");
                System.out.println("Entered mobile number");
                driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
                Thread.sleep(40000);
                driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
                
            } else {
                System.out.println("Mobile number input field not found");
            }
               Thread.sleep(20000);
  		System.out.println("On homepage");
           wait.until(ExpectedConditions.titleContains("Myntra"));
           WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
           if (searchBar.isDisplayed()) {
               System.out.println("User is on the Myntra homepage.");
           } else {
               System.out.println("User is not on the Myntra homepage.");
               driver.quit();
              }
    	searchBar.sendKeys("watch");
    	 searchBar.sendKeys(Keys.ENTER);
    //    searchBar.click();
     // Wait for the search results to load
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("results-base")));

        // Get the text and price of the first product in the search results
        List<WebElement> products = driver.findElements(By.className("results-base"));
        if (!products.isEmpty()) {
            WebElement firstProduct = products.get(0);
            String productName = firstProduct.findElement(By.className("product-brand")).getText();
            String productPrice = firstProduct.findElement(By.className("product-discountedPrice")).getText();
            
            System.out.println("Product Name: " + productName);
            System.out.println("Product Price: " + productPrice);
        } else {
            System.out.println("No products found.");
        }
        
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
