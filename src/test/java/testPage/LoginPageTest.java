package testPage;


import homepage.HotelSearch;
import homepage.LoginPage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utility.Base;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginPageTest extends Base{
	static WebDriver driver;
	LoginPage login;
	HotelSearch next;
	@BeforeClass
	public static void launchBrowser() {
		driver=getDriver();

	}

	@Test
	public void averifyLogin() {
		login = new LoginPage(driver);
		getScreenShot("loginpage");
		setText(login.getTxtUserName(), readValueFromExcelSheet().get(1).get("Username"));
		setText(login.getTxtUserPassword(), readValueFromExcelSheet().get(1).get("Password"));
		login.getTxtUserPassword().sendKeys(Keys.ENTER);
		getScreenShot("username");
		elementToBeVisible(driver, 20, login.getBtnLoginButton());
		clickBtn(login.getBtnLoginButton());
		System.out.println("Success");

	}
	@Test
	public void bsearchHotel1() {
		next = new HotelSearch(driver);
		Assert.assertTrue(elementFound(driver, 10, next.getTxtLogout()));
		dropDownSelect(next.getDrpLocation(), "London");
		dropDownSelect(next.getDrpHotel(), "Hotel Sunshine");
		dropDownSelect(next.getDrpRoomType(), "Double");
		dropDownSelect(next.getDrpRoom(), "2");
		setText(next.getTxtCheckinDate(), readValueFromExcelSheet().get(1).get("check in date"));
		setText(next.getTxtCheckOutDate(), readValueFromExcelSheet().get(1).get("check out date"));
		dropDownSelect(next.getDrpAdult(), "1");
		dropDownSelect(next.getDrpChild(), "3");
		getScreenShot("Hotelsearch");
		clickBtn(next.getBtnSearch());

	}
	

	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}

}
