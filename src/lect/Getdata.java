package lect;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Getdata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("D:\\Rashmi Salunke\\SOFTWARE TESTING\\All notes\\Automation\\Selenium\\SelPractice.xlsx");
	    String v=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	    System.out.println(v);
	
	
	}

}
