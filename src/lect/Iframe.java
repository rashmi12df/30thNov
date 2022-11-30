package lect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {
	public static void main(String[] args) {
	WebDriver driver=LBrowser.Open("https://demo.automationtesting.in/Frames.html");
	
	WebElement s=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	driver.switchTo().frame(s);
	
	WebElement enter=driver.findElement(By.xpath("//input[@type='text']"));
	enter.sendKeys("sacg");
	
	driver.switchTo().defaultContent();
	
	WebElement er=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	er.click();
	
	WebElement fr1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(fr1);
	
	WebElement fr2=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(fr2);
	
	WebElement enr=driver.findElement(By.xpath("//input[@type='text']"));
	enr.sendKeys("sacg");
	
	
	}

}
