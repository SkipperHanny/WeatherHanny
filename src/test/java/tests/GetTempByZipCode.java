package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.NationalCurrentWeatherPage;
import pageobjects.NationalWeatherRoclvillPage;
import pageobjects.RockvilleMDPage;


public class GetTempByZipCode extends BaseTest{
	
	@Test
	public void tc_01_Convert_Value_From_Celsius_To_Fahrenhite() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		Thread.sleep(4000);
		homePage.insertTextInSearch("20852");
		RockvilleMDPage rockwilleMdPage = new RockvilleMDPage(driver);
		System.out.println("The current temp in Rockvill by weather.com is " + rockwilleMdPage.getCurrentTemp());
 
		driver.get("https://www.accuweather.com/");
		Thread.sleep(3000);
		NationalCurrentWeatherPage npWeatherPage = new NationalCurrentWeatherPage(driver);
		homePage.changeFormatToFarhenight();
		driver.navigate().back();
		npWeatherPage.searchByZipCode("20852");
		Thread.sleep(3000);
		npWeatherPage.selectFromReslut();
		NationalWeatherRoclvillPage nwRockvill = new NationalWeatherRoclvillPage(driver);
		Thread.sleep(3000);
		System.out.println("The current temp in Rockvill by accuweather.com is " + nwRockvill.getCurrentTemp());
		
		//Validate
//		Assert.assertEquals(actual, expected, message);
		
		
		
	}

}
