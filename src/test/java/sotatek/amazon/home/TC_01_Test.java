package sotatek.amazon.home;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.HomePageObject;
import pageObject.PageGeneratorManager;

public class TC_01_Test extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;
	
	
	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String urlValue) {
		driver = getBrowserDriver(browserName, urlValue);
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC_01_Test_Sotatek() {
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Lazada - Step 01: Enter to Search textbox");
		homePage.enterToSearchTextbox("iphone 11");
		
		log.info("Lazada - Step 02: Verify 'Apple iPhone 11 ' text displayed");
		homePage.verifyTextIphone11Displayed();
		
		log.info("Lazada - Step 03: Click to Apple checkbox");
		homePage.clickToAppleCheckbox();
			
		log.info("Lazada - Step 04: Select to Sort dropdown");
		homePage.selectInSortDropdown("Price: Low to High");
		
		log.info("Lazada - Step 05: Verify sort Price: lowest first");
		verifyTrue(homePage.isSortPriceAscending());
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}
}
