package lect;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
	public static void main(String[] args) {
		WebDriver driver=LBrowser.Open("https://demoqa.com/text-box");
		
		WebElement hgf=driver.findElement(By.xpath("//input[@id='userName']"));
		hgf.sendKeys("rashmi salunke");
		
	    Actions act=new Actions(driver);
	       act.keyDown(Keys.CONTROL);
		   act.sendKeys("a");
		   act.keyUp(Keys.CONTROL);
		   act.build().perform(); 
	    
	    
	   act.keyDown(Keys.CONTROL);
	   act.sendKeys("c");
	   act.keyUp(Keys.CONTROL);
	   act.build().perform();
	   
	   act.sendKeys(Keys.TAB);  
	   act.keyDown(Keys.CONTROL);
	   act.sendKeys("v");
	   act.keyUp(Keys.CONTROL);
	   act.build().perform();
	   
	   
	
	
	
	
	
	}
}
