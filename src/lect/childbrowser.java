package lect;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childbrowser {
	public static void main(String[] args) {
	WebDriver driver=LBrowser.Open("https://vctcpune.com/");
	
	WebElement pract=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	pract.click();
	
	//String st=driver.getWindowHandle();
	
	Set<String>st=driver.getWindowHandles();
	int l=st.size();
	System.out.println(l);
	Iterator <String>itr=st.iterator();
	
	while(itr.hasNext())
	{
		String handles=itr.next();
		driver.switchTo().window(handles);
		String acttitle=driver.getTitle();
		if(acttitle.equals("Practice Page"))
		{
			WebElement ele=driver.findElement(By.xpath("//input[@name='enter-name']"));
			ele.sendKeys("India");
			
		}
	}
	

	
	
}}
