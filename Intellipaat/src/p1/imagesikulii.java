package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class imagesikulii {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\bin\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Screen s1 = new Screen();
		Pattern Punm = new Pattern("Path of username image");
		Pattern Ppwd = new Pattern("Path of password image");
		Pattern Plog = new Pattern("Path of login-button image");
		
		s1.type(Punm, "A1@gmail.com");
		s1.type(Ppwd, "aaa");
		s1.click(Plog);


	}

}
