package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ProjectMaven.ProjectMavenJava.BaseClass;

public class ConfirmationPage extends BaseClass {
	
	  public ConfirmationPage() {
		  
		  PageFactory.initElements(driver, this);

	  }

	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy (id = "continue")
	private WebElement continueBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
}
