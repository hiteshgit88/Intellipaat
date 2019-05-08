package com.Facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\bin\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		ReadingProperties rp = new ReadingProperties();
		rp.returnLocator(driver, "uname").sendKeys("a1@gmail.com");
		
		rp.returnLocator(driver, "password").sendKeys("test");
		
		rp.returnLocator(driver, "log").click();
		
	}

}
