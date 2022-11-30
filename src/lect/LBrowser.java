package lect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LBrowser {
	public static WebDriver Open(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Dependency\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.naukri.com/");
		
		driver.navigate().to(url);
		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
//	    
    	driver.manage().window().maximize();
//	    
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		Options op=driver.manage();
//		Window win=op.window();
//		win.minimize();
//		
//		Dimension di=new Dimension(100,250);
//		driver.manage().window().setSize(di);
//		
//		
//		Point p=new Point(100,200);
//		driver.manage().window().setPosition(p);
    	return driver;
		
	}
}
