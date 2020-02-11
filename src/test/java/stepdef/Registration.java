package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {

	WebDriver driver=null;
	
	@Given("^the registration page is opened$")
	public void the_registration_page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.25\\Desktop\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Register")).click();  
	   
	}

	@When("^user enters First name as vidya$")
	public void user_enters_First_name_as_vidya() throws Throwable {
		 driver.findElement(By.name("FirstName")).sendKeys("vidya");
	    
	}

	@When("^user enters last name as patagar$")
	public void user_enters_last_name_as_patagar() throws Throwable {
		 driver.findElement(By.name("LastName")).sendKeys("patagar");
	    
	    
	}

	@When("^user enters email as vidyapatagar(\\d+)@gmail\\.com$")
	public void user_enters_email_as_vidyapatagar_gmail_com(int arg1) throws Throwable {
		 driver.findElement(By.id("Email")).sendKeys("vidyapatagar246@gmail.com");
	}

	@When("^user enters password as Vidya@(\\d+)$")
	public void user_enters_password_as_Vidya(int arg1) throws Throwable {
		driver.findElement(By.name("Password")).sendKeys("Vidya@123");
	   
	}

	@When("^user enters Confirm password as Vidya@(\\d+)$")
	public void user_enters_Confirm_password_as_Vidya(int arg1) throws Throwable {
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Vidya@123");
	}

	@Then("^user clicks on Register button$")
	public void user_clicks_on_Register_button() throws Throwable {
		 driver.findElement(By.xpath("//input[@name='register-button']")).click();
	}

	@Then("^Register should be succussfully$")
	public void register_should_be_succussfully() throws Throwable {
	    
	}

}
