package autom.wowhead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageAccueil {
	
	//url_initial = "https://fr.wowhead.com";
	
	public PageAccueil(WebDriver driver, String url) {
		super();
		this.driver = driver;
		driver.get(url);
	}
	
	@FindBy(how = How.XPATH, using="//input[@placeholder]") 
	private WebElement search_input;
	
	@FindBy(how = How.XPATH, using="//a[@class='header-search-button fa fa-search']") 
	private WebElement search_bouton;
	
		public PageLardeur search(String text) {
		search_input.clear();
		search_input.sendKeys(text);
		search_bouton.click();
		return PageFactory.initElements(driver, PageLardeur.class);
	}
}
