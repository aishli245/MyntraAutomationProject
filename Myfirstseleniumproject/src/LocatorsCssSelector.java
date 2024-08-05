import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopify.com/in/free-trial/3-steps?term=shopify.com&adid=566143385906&campaignid=15433369407&branded_enterprise=1&BOID=brand&utm_medium=cpc&utm_source=google&gad_source=1&gclid=CjwKCAjwhvi0BhA4EiwAX25uj-tZZhWDpwKjBE_Wrl3GXLgiDsCMC29iDPxJflX45j97SdrI15-roxoCp9YQAvD_BwE&cmadid=516585705;cmadvertiserid=10730501;cmcampaignid=26990768;cmplacementid=324494758;cmcreativeid=163722649;cmsiteid=5500011");
		//tag id - syntaxx--tag#id
		//driver.manage().window().maximize();//maximize the browser window
		//driver.findElement(By.cssSelector("input#small-Search")).sendKeys("Phone");
		
		//tag class
		
		driver.findElement(By.cssSelector("input._Input_hnr24_88")).sendKeys("phone");
		//driver.findElement(By.i(""))
		//driver.findElement(By.xpath(""))

	}

}
