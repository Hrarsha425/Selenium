package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemo 
{

	public static void main(String[] args) 
	{
		RemoteWebDriver driver;
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\LENOVO\\Desktop\\web drivers\\chromedriver.exe");
		driver=new FirefoxDriver();
	
		System.setProperty("webdriver.Firefox.driver","C:\\Users\\LENOVO\\Desktop\\web drivers\\geckodriver.exe" );
		driver.get("https:\\www.amazon.in");
		
	}

}
