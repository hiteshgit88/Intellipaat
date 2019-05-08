package p1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\bin\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Dimension d = new Dimension(500 , 500);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("scroll(0,+500)");
		Thread.sleep(3000);
		js.executeScript("scroll(+500,+500)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,-500)");
		Thread.sleep(3000);
		js.executeScript("scroll(-500,-500)");
		Thread.sleep(3000);

	}

}
