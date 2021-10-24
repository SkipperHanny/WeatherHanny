package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindYourLocationWeatherPage extends BasePage{
	//Local variables
			@FindBy(css = "div.locations-list.content-module > a:nth-child(1)")
			WebElement locationResult;
	
	//Constructor
	public FindYourLocationWeatherPage(WebDriver driver) {
		super(driver);
	}
	
	//Methods
	public void clickOnResult () {
		click(locationResult);
	}

}
