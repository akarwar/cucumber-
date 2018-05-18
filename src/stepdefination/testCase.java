package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testCase {
	
	WebDriver driver;
	
	@Given("^I have firefox browser running$")
	public void i_have_firefox_browser_running()  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ahsan\\Documents\\Drivers\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
	    
	}

	@When("^I go to the website$")
	public void i_go_to_the_website() {
		driver.get("http://opensource.demo.orangehrmlive.com/");
	  
	}

	@When("^I enter valid username$")
	public void i_enter_valid_username() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
	    
	}

	@When("^I enter valid password$")
	public void i_enter_valid_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button()  {
		driver.findElement(By.name("Submit")).click();
	  
	}

	@Then("^I shooud see a logout link$")
	public void i_shooud_see_a_logout_link()  {
		
	
	}

	@Given("^I have a Chrome browser running$")
	public void i_have_a_Chrome_browser_running()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		
	}
		
		public void i_enter_valid_username(String uname) throws Throwable {
			driver.findElement(By.id("txtUsername")).sendKeys(uname);
		    
		}

		
		public void i_enter_valid_password(String pwd) throws Throwable {
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		
		
	
		
	}
	
	

}
