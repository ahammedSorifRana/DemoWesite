package test.DemoProject.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	WebDriver xDriver;
	
	@FindBy(xpath=".//*[@id='customer_login_link']")
	WebElement ClickOnLogin;
	
	@FindBy(xpath=".//*[@id='CustomerEmail']")
	WebElement EnterEamil;
	@FindBy(xpath=".//*[@id='CustomerPassword']")
	WebElement EnterPass;
	@FindBy(xpath="//form[contains(@id,'customer')]//input[@class='btn']")
	WebElement ClickOnSingIn;
	
	public  HomePage(WebDriver driver) {
		this.xDriver = driver;
		PageFactory.initElements(driver, this);

		}
	
	public void logInApp(String EmailAdd,String PassWord) {
	 xDriver.switchTo().frame(xDriver.findElement(By.id("PreviewFrame")));
		ClickOnLogin.click();
		EnterEamil.sendKeys(EmailAdd);
		EnterPass.sendKeys(PassWord);
		ClickOnSingIn.click();
		}
	

}
