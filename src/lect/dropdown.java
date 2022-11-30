package lect;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws IOException {
		WebDriver driver=LBrowser.Open("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement ele=driver.findElement(By.xpath("//select[@id='animals']"));
		Select sel=new Select(ele);
	//	sel.selectByIndex(1);
		sel.selectByValue("big baby cat");
		
		screenshot.picture(driver,"firats");
			
	}
}