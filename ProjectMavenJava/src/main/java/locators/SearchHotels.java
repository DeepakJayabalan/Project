package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ProjectMaven.ProjectMavenJava.BaseClass;

public class SearchHotels extends BaseClass {

	public SearchHotels() {
			
			PageFactory.initElements(driver, this);
		}

	    @FindBy(id= "location")
		private WebElement selectLocation ;
		
		@FindBy(id= "hotels")
		private WebElement selectHotel;
		
		@FindBy(id = "room_type")
		private WebElement selectRoomType;
		
		@FindBy (id = "room_nos")
		private WebElement numberOfRooms;
		
		public WebElement getSelectLocation() {
			return selectLocation;
		}

		public WebElement getSelectHotel() {
			return selectHotel;
		}

		public WebElement getSelectRoomType() {
			return selectRoomType;
		}

		public WebElement getNumberOfRooms() {
			return numberOfRooms;
		}

		public WebElement getCheckInDate() {
			return checkInDate;
		}

		public WebElement getCheckOutDate() {
			return checkOutDate;
		}

		public WebElement getAdultPerRoom() {
			return adultPerRoom;
		}

		public WebElement getChildrensPerRoom() {
			return childrensPerRoom;
		}

		public WebElement getSearchBtn() {
			return searchBtn;
		}

		@FindBy (id = "datepick_in")
		private WebElement checkInDate;
		
		@FindBy (id = "datepick_out")
		private WebElement checkOutDate;
		
		@FindBy (id = "adult_room")
		private WebElement adultPerRoom;
		
		@FindBy (id = "child_room")
		private WebElement childrensPerRoom;
		
		@FindBy (id = "Submit")
		private WebElement searchBtn;

}