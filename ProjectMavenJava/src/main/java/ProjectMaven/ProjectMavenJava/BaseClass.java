package ProjectMaven.ProjectMavenJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public  static WebDriver driver;
	
	 public void getDriver() {
		 
		 System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\Sree Kaam\\Desktop\\Work_Space\\ProjectMavenJava\\driver\\chromedriver.exe");
         driver= new ChromeDriver();
         driver.manage().window().maximize();
	}
	 
	 public void deleteAllCookies() {
		 
		 driver.manage().deleteAllCookies();
		
	}
	 
	 public void pageLoadTimeout() {
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}
	 
	 public void implicitWait() {
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	 
	 public void launchUrl (String url) {
     
		 driver.get(url);
	}
	 
	 public void typeText(WebElement element , String data) {
		 
		 element.sendKeys(data);
		 
	 }
	 
	 public void btnClick(WebElement element ) {
		 
		 element.click();
		
	}
	 
	 public void switchToFrames(int indexNo) {
		 
		 driver.switchTo().frame(indexNo);
		
	}
	 
	 public void mouseHover(WebElement target) {
		 
		 Actions  ac = new Actions(driver);
		 ac.moveToElement(target).perform();
		
	}
	 
	 public void doubleClick(WebElement target) {
		 
		 Actions  ac = new Actions(driver);
		 ac.doubleClick(target).perform();
		 
	 }
	 
	 public void rightClick(WebElement target) {
		 
		 Actions  ac = new Actions(driver);
		 ac.contextClick(target).perform();
		
	}
	 
	 public void dragAndDrop(WebElement target1, WebElement target2) {
		 Actions  ac = new Actions(driver);
		 ac.clickAndHold(target1).moveToElement(target2).release().perform();
		
	}
	 
	 public void selectDropDown(WebElement element , String value) {
		 
		 Select select = new Select(element);
		 select.selectByVisibleText(value);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
	}
	
	
	


