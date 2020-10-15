package stepdefinition;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WombaChangeLanguage extends ScreenshotsDemo
{Properties obj=new Properties();
	
	@When("^User is logged in to womba application$")
	public void user_is_logged_in_to_womba_application() throws Throwable {
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");

		driver=new ChromeDriver();
	driver.get("https://eu-womba-qa.dunnsolutions.com");
	    driver.manage().window().maximize();
	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
		obj.load(objfile);
		Thread.sleep(10000);
		driver.findElement(By.xpath(obj.getProperty("input.username"))).sendKeys("hsx@womba.com");
		
		driver.findElement(By.xpath(obj.getProperty("input.password"))).sendKeys("Password123@");
		driver.findElement(By.xpath(obj.getProperty("signIn.btn"))).click();*/
	    
	}

	@When("^Clicks on Change language button from navigation bar$")
	public void clicks_on_Change_language_button_from_navigation_bar() throws Throwable {
		driver.findElement(By.xpath(obj.getProperty("dropdownLanguage.btn"))).click();
		
	
	}

	@Then("^Select language and application language is changed$")
	public void select_language_and_application_language_is_changed() throws Throwable {
		driver.findElement(By.xpath(obj.getProperty("SelectLanguage.btn"))).click();
	    

}
}
