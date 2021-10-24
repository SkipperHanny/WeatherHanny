package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NationalWeatherRoclvillPage extends BasePage {
	// Local variables
	@FindBy(css = "div:nth-child(1) > div > div > div.temp")
	WebElement currentTemp;

	// Constructor
	public NationalWeatherRoclvillPage(WebDriver driver) {
		super(driver);
	}

	// Methods
	public String getCurrentTemp() {
		return getText(currentTemp);
	}

	// Validation

	public boolean checkTempRange() {
		RockvilleMDPage rockvilleMD = new RockvilleMDPage(driver);
		int weather = Integer.parseInt(rockvilleMD.getCurrentTemp());
		int npWeather = Integer.parseInt(currentTemp.getText());
		if ((((weather - npWeather) * -1) / 100) < (0.10)) {
			return true;
		}
		return false;
	}

}
