import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleUthenticatedPopup {

	public static void main(String[] args) {
		

		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//syntax:https://the-internet.herokuapp.com/basic_auth
			
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
