package com.Facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadingProperties {
	
	public String getElementName(String ElementName) throws IOException
	{
		Properties p1 = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Crest\\Desktop\\locator.properties");
		
		p1.load(fis);
		
		String ElementDetails = p1.getProperty(ElementName);
		return ElementDetails;
	}
	
	public WebElement returnLocator(WebDriver driver,String elementName) throws IOException
	{
		WebElement element = null;
		
		ReadingProperties rp = new ReadingProperties();
		String name = rp.getElementName(elementName);  //id:email
		
		String locator[] = name.split(":");
		
		switch(locator[0])
		{
		case "id":
			driver.findElement(By.id(locator[1]));
			break;
			
		case "name":
			driver.findElement(By.name(locator[1]));
			break;
			
		case "xpath":
			driver.findElement(By.xpath(locator[1]));
			break;
		}
		
		return element;
		
	}

}
