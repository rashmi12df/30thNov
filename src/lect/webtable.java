package lect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webtable {
	public static void main(String[] args) {
		WebDriver driver=LBrowser.Open("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> ele=driver.findElements(By.xpath("//table//tbody//tr"));
		int l=ele.size();
		System.out.println(l);
		double max=0;
		for(int i=1; i<=l; i++) {
			WebElement cprice=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
		     String pname=cprice.getText();
		     double d=Double.parseDouble(pname);
		     if(d>max) {
		    	 max=d;
		     }
		System.out.println(max);
		}			
	}

}
