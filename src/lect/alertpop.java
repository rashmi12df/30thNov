package lect;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alertpop {
public static void main(String[] args) {
	WebDriver driver=LBrowser.Open("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	WebElement promt=driver.findElement(By.xpath("//input[@name='prompt']"));
	promt.click();
	
	Alert a=driver.switchTo().alert();
	
	System.out.println(a.getText());
	a.sendKeys("Yes");
	a.accept();
	
}
}
