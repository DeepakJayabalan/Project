package ProjectMaven.ProjectMavenJava;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Ascending extends BaseClass {

	public static void main(String[] args) {

		BaseClass class1 = new BaseClass();
		
		class1.getDriver();
		
		class1.launchUrl("https://www.amazon.com/");
		class1.pageLoadTimeout();
		
		class1.implicitWait();
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("earphones",Keys.ENTER);
		ArrayList<String> all = new ArrayList<String>();
		
		List<WebElement> listOfPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
        for (int i = 0; i < listOfPrice.size(); i++) {
        	
        	String tagName = listOfPrice.get(i).getText();
        	
        	all.add(tagName);
        	
        	Collections.sort(all);
        	
        	System.out.println("Ascending order :"+all);
			
		}
		     
		
		driver.quit();
		
		
		
		
		
		
	}

}
