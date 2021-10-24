package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RockvilleMDPage extends BasePage{

	//Local variables
	@FindBy(css = "div.CurrentConditions--primary--2SVPh > span")
	WebElement currentTemp;
	
	//constructor
	public RockvilleMDPage(WebDriver driver) {
		super(driver);
	}
	
	//Methods
	public String getCurrentTemp () {
		return getText(currentTemp);
	}

}
