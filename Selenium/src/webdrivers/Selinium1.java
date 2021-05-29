package webdrivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selinium1 
{

	public static void main(String[] args) 
	{
		WebDriver driver;//SuperClass, Object
		 System.setProperty("webdriver.gecko.driver", "\\C:\\Users\\LENOVO\\Desktop\\web drivers\\geckodriver.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https:\\www.amazon.in");
		  
		  driver=new FirefoxDriver();
		  driver.get("https:\\www.myntra.in");
	}

}