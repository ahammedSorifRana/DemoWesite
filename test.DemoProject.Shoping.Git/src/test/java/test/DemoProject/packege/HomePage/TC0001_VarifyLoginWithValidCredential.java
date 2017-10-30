package test.DemoProject.packege.HomePage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.DemoProject.Action.HomePage;
import test.DemoProject.BaseTest.BaseTest;

public class TC0001_VarifyLoginWithValidCredential extends BaseTest {
	
	HomePage homepage;
	@BeforeTest
	public void setUp() {
		init();
		}
	@Test
	public void VarifyWithValidCredential() {
		
		homepage = new HomePage(Driver);
		homepage.logInApp("ahammed@ahammedsorif.com", "Rana0260");

		}
	@AfterTest
	public void endTest() {
		Driver.close();
	}

}
