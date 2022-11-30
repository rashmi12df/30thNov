package lect;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void picture(WebDriver driver,String name) throws IOException {
		String time=screenshot.date();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\Rashmi Salunke\\SOFTWARE TESTING\\All notes\\Automation\\Selenium\\ScreenShot\\"+name+time+".jpg");
		
		FileHandler.copy(source, destination);
	}
		
		public static String date() {
			DateTimeFormatter t=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
			LocalDateTime lc=LocalDateTime.now();
			String time=t.format(lc);
			return time;
			
	}

}
