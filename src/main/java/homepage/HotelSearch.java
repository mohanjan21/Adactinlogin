package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearch {
	WebDriver driver;
	@FindBy(xpath="//*[text()='Logout']")
	private WebElement txtLogout;
	@FindBy(id="location")
	private WebElement drpLocation;
	@FindBy(id="hotels")
	private WebElement DrpHotel;
	@FindBy(id="room_type")
	private WebElement drpRoomType;
	@FindBy(id="room_nos")
	private WebElement drpRoom;
	@FindBy(id="datepick_in")
	private WebElement txtCheckinDate;
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	@FindBy(id="adult_room")
	private WebElement drpAdult;
	@FindBy(id="child_room")
	private WebElement drpChild;
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	public WebElement getDrpLocation() {
		return drpLocation;
	}


	public WebElement getDrpHotel() {
		return DrpHotel;
	}


	public WebElement getDrpRoomType() {
		return drpRoomType;
	}


	public WebElement getDrpRoom() {
		return drpRoom;
	}


	public WebElement getTxtCheckinDate() {
		return txtCheckinDate;
	}


	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}


	public WebElement getDrpAdult() {
		return drpAdult;
	}


	public WebElement getDrpChild() {
		return drpChild;
	}


	public WebElement getBtnSearch() {
		return btnSearch;
	}


	
	
	public WebElement getTxtLogout() {
		return txtLogout;
	}


	public HotelSearch(WebDriver ldriver) {
		   this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}

}



