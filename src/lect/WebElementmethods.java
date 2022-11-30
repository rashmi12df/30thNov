package lect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementmethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Automation Dependency\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//a[@title=\"Jobseeker Login\"]"));
		ele.click();
		
		boolean dis=ele.isDisplayed();
		System.out.println(dis);
		
		boolean b=ele.isEnabled();
		System.out.println(b);
		
		boolean sel=ele.isSelected();
		System.out.println(sel);
		
	}

}
