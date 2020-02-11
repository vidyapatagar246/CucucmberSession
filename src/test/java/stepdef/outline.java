package stepdef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class outline {
	
	WebDriver driver=null;
	@Given("^User is open the application$")
	public void user_is_open_the_application() throws Throwable {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.25\\Desktop\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
	          driver=new ChromeDriver();
	          driver.get("http://demowebshop.tricentis.com/");
	          driver.manage().window().maximize();
	          driver.findElement(By.linkText("Log in")).click();
	    }

	   
	

	@When("^User clicks on to signin link$")
	public void user_clicks_on_to_signin_link()  {
	    driver.findElement(By.linkText("Log in")).click();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password)  {
		driver.findElement(By.id("Email")).sendKeys(username);
		 driver.findElement(By.name("Password")).sendKeys(password);
		
	 
	}

	@Then("^User will click on login button$")
	public void user_will_click_on_login_button()  {
		 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
    
	  
	}

	@Then("^Demo webshop homepage will dispaly$")
	public void demo_webshop_homepage_will_dispaly()  {
	 
	}

}
