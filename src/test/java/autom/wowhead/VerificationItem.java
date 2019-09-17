package autom.wowhead;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerificationItem {
	
	WebDriver driver ;
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\Documents\\eclipse-workspace\\drivers\\chromedriver.exe");
		
		//Aller sur le site 'https://fr.wowhead.com/'
		driver = new FirefoxDriver();
		driver.get("https://fr.wowhead.com/");
		
		WebElement bouton_cookie = FindElement (by=Xpath, "");
		
		//ouvrir la page accueil
		//PageAccueil start_page = new PageAccueil(driver, "https://fr.wowhead.com") ;
		
		
	}
	
}
