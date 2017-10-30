package test.DemoProject.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	String URL ="file:///c://Users/Ahammed%20Sorif/Desktop/Demo_Site/demoSite.htm";
	String Browser = "Firefox";
	public WebDriver Driver; 
	
	public void init() {
		chooseBrowser(Browser);
		getUrl(URL);
		//String log4jConfPath ="log4j.properties";
		//PropertyConfigurator.configure(log4jConfPath);
		
	}
	
	
	public void chooseBrowser(String Browser) {
		
		//log.info("creating object of "+Browser);
		switch(Browser) {
		case"Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ahammed Sorif\\Desktop\\Selenium\\Selenium_Driver\\geckodriver.exe");

			Driver = new FirefoxDriver();
			break;
		case"Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahammed Sorif\\Desktop\\Selenium\\Selenium_Driver\\chromedriver.exe");
			 Driver = new ChromeDriver();
			
			 break;
		default:
			System.out.println("Browser Not Found");
			break;
		
			}
		}
	
	public void getUrl(String URL) {
		//log.info("Navigating to :" +URL);
		
		Driver.get(URL);
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		}
	

}
