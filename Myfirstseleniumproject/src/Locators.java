
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Locators {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=12520013181725682074&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198075&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("email")).sendKeys("aishli@gmail.com");
		//driver.findElement(By.linkText("Instagram")).click();we can more prefer this becoz in this we send full text like instagram
		driver.findElement(By.partialLinkText("Insta")).click();

		//tagname
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("total number of links:" +links.size());
		
		//total no of images in amazon.com
		List<WebElement> images=driver.findElements(By.tagName("tag"));
		System.out.println("total number of images:" + images.size());
		
		
	}

}
