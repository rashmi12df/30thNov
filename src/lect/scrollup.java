package lect;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scrollup {
	public static void main(String[] args) {
		WebDriver driver=LBrowser.Open("https://vctcpune.com/selenium/practice.html");
		
		WebElement ele=driver.findElement(By.xpath("//input[@value='option2']"));
		
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", ele);

	//    WebElement ele1=driver.findElement(By.xpath("//input[@value='option2']"));
	
	    ((JavascriptExecutor)driver).executeScript("arguments[0].click()", ele);
		
	}
}
