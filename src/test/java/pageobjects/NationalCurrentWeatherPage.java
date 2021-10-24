package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NationalCurrentWeatherPage extends BasePage{

	//Local variables
	@FindBy(css = ".search-input")
	WebElement searchField;
	@FindBy(css = "div.results-container > div:nth-child(1)")
	WebElement selectResult;
	
	//Constructor
	public NationalCurrentWeatherPage(WebDriver driver) {
		super(driver);
	}
	
	//Methods
	public void searchByZipCode (String searchValue) {
		fillText(searchField, searchValue);
	}
	
	public void selectFromReslut () {
		click(selectResult);
	}

}
