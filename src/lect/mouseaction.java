package lect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {
	public static void main(String[] args) {
	WebDriver driver=LBrowser.Open("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions act=new Actions(driver);
	act.contextClick(rightclick);
	act.perform();
	
	WebElement dclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	act.doubleClick(dclick);
	act.perform();
	
	}
}
