package p1;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class download {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\bin\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java download");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//h3[contains(text(),'Download Free Java Software')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Java Download')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Agree and Start Free Download')]")).click();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
