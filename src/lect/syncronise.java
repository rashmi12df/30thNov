package lect;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syncronise {
	public static void main(String[] args) {
    WebDriver driver=LBrowser.Open("");
	
	//implicite wait
	
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	
	/* 
	Explicite wait
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
	wait.until(ExpectedConditions.visibilityOf(element));
   
   */
	
	FluentWait<WebDriver>wait=new FluentWait(driver);
	wait.withTimeout(Duration.ofMillis(2000));
	wait.pollingEvery(Duration.ofMillis(200));
	wait.ignoring(Exception.class);
	wait.until(ExpectedConditions.alertIsPresent());
	
	
}}
