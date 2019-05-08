package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid1 {

	public static void main(String[] args) throws MalformedURLException {
		// Provide the HUB Address
		
		String hub = "http://192.168.0.3:4444/wd/hub";
		String Url = "http://www.google.com";
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\eclipse\\\\bin\\\\chromedriver.exe");
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		
		WebDriver driver = new RemoteWebDriver(new URL(hub),cap);
		
		driver.navigate().to(Url);

	}

}
