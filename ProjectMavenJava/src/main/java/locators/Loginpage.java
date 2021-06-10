package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ProjectMaven.ProjectMavenJava.BaseClass;


public class Loginpage extends BaseClass {
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(id = "username")
   private WebElement txtUserName;
   
   @FindBy(xpath="//input[@class='password']")
   private WebElement txtPassword;
   
   public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getBtnLogin() {
	return btnLogin;
}

@FindBy(name= "login")
   private WebElement btnLogin;

}
