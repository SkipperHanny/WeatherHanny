package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{
	
	//Local variables
		@FindBy(css = "#LocationSearch_input")
		WebElement searchField;
		@FindBy(css = "#LocationSearch_listbox-0")
		WebElement locationsResult;
		@FindBy(css = ".hamburger-button.icon-hamburger")
		WebElement menuuBtn;
		@FindBy(css = ".icon-settings")
		WebElement settingBtn;
		@FindBy(css = "#unit")
		WebElement unitBtn;

	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Methods
	public void insertTextInSearch (String searchValue) throws InterruptedException {
		fillText(searchField, searchValue);
		Thread.sleep(2000);
		click(locationsResult);
	}
	
	public void changeFormatToFarhenight () {
		click(menuuBtn);
		click(settingBtn);
		Select format = new Select(unitBtn);
		format.selectByVisibleText("Imperial (°F, mph, in)");
	}
//	
//	public void selectValueFromList (String locationValue) {
//		Select location = new Select(locationsList);
//		location.deselectByVisibleText(locationValue);
//	}

}
