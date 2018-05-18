package hookTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HookTestCase1 {
	WebDriver driver;
	
	
	@Given("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password(DataTable AZN)  {
		List<List<String>>dataTbl = AZN.raw();
		
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys(dataTbl.get(0).get(0));
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys(dataTbl.get(0).get(1));
		
	}
	    

	@When("^I go to the Amazon Website$")
	
	public void i_go_to_the_Amazon_Website()  {
		
		driver.get("https://www.amazon.com");
	
	}

	

	@When("^Cilck Signin$")
	public void cilck_Signin() {
		
		driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-0-announce']")).click();
	    
	}

	
	
	
	//GlobalHook
	@Before
	public void runBrowser() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\ahsan\\Documents\\Drivers\\geckodriver-v0.20.1-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
			
		//Local Hook	
		@Before("@first")
	public void	gotoUrl()	 {
		driver.get("http//amazon.com");
		}
		
		//Local After Hook
		@After("@first")
	public void quitBrowser() {
		driver.quit();
		}	
			


}
