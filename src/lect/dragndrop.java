package lect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LBrowser.Open("https://www.globalsqa.com/demo-site/draganddrop/");
	    
		WebElement ifr=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(ifr);
		
		List<WebElement> picture=driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content ')]"));
		int l=picture.size();
		
		WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
		
		System.out.println(l);
		for(int i=0; i<l; i++)
		{
			WebElement picture1=picture.get(i);
			Thread.sleep(2000);
			Actions act=new Actions(driver);
			act.dragAndDrop(picture1, trash);
			act.build().perform();
		}
	}
}
