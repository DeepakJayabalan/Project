package ProjectMaven.ProjectMavenJava;

import org.openqa.selenium.WebElement;

import locators.ConfirmationPage;
import locators.Loginpage;
import locators.SearchHotels;

 public class pomconcept extends BaseClass {
	
	 public static void main(String[] args) {
		
		BaseClass base = new BaseClass();
		base.getDriver();
		base.launchUrl("https://adactinhotelapp.com/");
		base.pageLoadTimeout();
		base.implicitWait();
		
		Loginpage loginpage = new Loginpage();
		
		WebElement txtUserName = loginpage.getTxtUserName();
		txtUserName.sendKeys("Karthi007");
		
		WebElement txtPassword = loginpage.getTxtPassword();
		txtPassword.sendKeys("Karthi@1989");
		
		WebElement btnLogin = loginpage.getBtnLogin();
		btnLogin.click();
		
		SearchHotels hotels = new SearchHotels();
		
		WebElement selectLocation = hotels.getSelectLocation();
		base.selectDropDown(selectLocation, "Melbourne");
		
		WebElement selectHotel = hotels.getSelectHotel();
		base.selectDropDown(selectHotel, "Hotel Creek");
		
		WebElement selectRoomType = hotels.getSelectRoomType();
		base.selectDropDown(selectRoomType, "Deluxe");
		
		WebElement numberOfRooms = hotels.getNumberOfRooms();
		base.selectDropDown(numberOfRooms, "2 - Two");
		
		WebElement checkInDate = hotels.getCheckOutDate();
		checkInDate.sendKeys("12/06/2021");
		
		WebElement checkOutDate = hotels.getCheckInDate();
		checkOutDate.sendKeys("13/06/2021");
		
		WebElement adultPerRoom = hotels.getAdultPerRoom();
		base.selectDropDown(adultPerRoom, "2 - Two");
		
		WebElement childrensPerRoom = hotels.getChildrensPerRoom();
		base.selectDropDown(childrensPerRoom, "2 - Two");
		
		WebElement searchBtn = hotels.getSearchBtn();
		searchBtn.click();
		
		ConfirmationPage confirm = new ConfirmationPage();
		
		WebElement radioBtn = confirm.getRadioBtn();
		radioBtn.click();
		
		WebElement continueBtn = confirm.getContinueBtn();
		continueBtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
