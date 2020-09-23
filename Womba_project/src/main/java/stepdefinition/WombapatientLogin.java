package stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WombapatientLogin
{	 static WebDriver driver;
Properties obj=new Properties();
	@When("^Enter the url for womba application and userid$")
	public void enter_the_url_for_womba_application_and_userid() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");

		driver=new ChromeDriver();
	driver.get("https://eu-womba-qa.dunnsolutions.com");
	    driver.manage().window().maximize();
	    
		
	}

	@When("^Enter password$")
	public void enter_password() throws Throwable {
		
		 FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
			obj.load(objfile);
			Thread.sleep(10000);
			driver.findElement(By.xpath(obj.getProperty("input.username"))).sendKeys("hsx@womba.com");
			
			driver.findElement(By.xpath(obj.getProperty("input.password"))).sendKeys("Password123@");
			driver.findElement(By.xpath(obj.getProperty("signIn.btn"))).click();
	}

	@Then("^I should be login to womba application$")
	public void i_should_be_login_to_womba_application() throws Throwable {
		Thread.sleep(10000);
		
//String Text=driver.findElement(By.xpath("(//ul[@class=\"navbar-nav navbar-right\"]/li[1])")).getText();
		
//		System.out.print(Text);
//	String	substring=Text.substring(1,7);
	String Welcome="Welcome";
	
	
	}	
	
	
}

