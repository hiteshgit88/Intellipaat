package com.Facebook;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login2 {

	public static void main(String[] args) throws IOException, BiffException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\bin\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\Crest\\Desktop\\sample.xls"));
		
		Sheet sh = wb.getSheet("abc");
		
		for(int i=1; i<sh.getRows(); i++)
		{
			driver.get("https://www.facebook.com/");
			
			ReadingProperties rp = new ReadingProperties();
			
			rp.returnLocator(driver, "uname").sendKeys(sh.getCell(0, i).getContents());
			
			rp.returnLocator(driver, "password").sendKeys(sh.getCell(1, i).getContents());
			
			rp.returnLocator(driver, "log").click();
		}
		
		
	}

}
