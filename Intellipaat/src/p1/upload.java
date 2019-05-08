package p1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\bin\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		Robot r = new Robot();
		
		driver.findElement(By.id("input_resumeParser")).click();
		r.setAutoDelay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\Crest\\Desktop\\sample.xls"); //this copies file path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //this copies from clipboard to internal system buffer
		
		r.setAutoDelay(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.setAutoDelay(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);


	}

}
