package PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageDemo2 {
	
	public static void main(String[] args) {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.25\\Desktop\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
	          WebDriver driver=new ChromeDriver();
	          driver.get("http://demowebshop.tricentis.com/");
	          driver.manage().window().maximize();
	          PageClass pobject=new PageClass(driver);
	          pobject.click_lnc();
	          pobject.type_uname();
	          pobject.type_pwd();
	          pobject.click_lbtn();
	          
	          
	}

}
