package stepdefinition;
/*edfbshbfhbbsdbdvbsdhbcsdhbfshdvfffffvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class flipcartlogin
{
/*efbw*/
	 static WebDriver driver;
	 Properties obj=new Properties();
	@Given("^Open flipcart login page$")
	public void open_flipcart_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");

		driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
		obj.load(objfile);
	}

	@Given("^Enter username \"([^\"]*)\"and password \"([^\"]*)\" and click on submit$")
	public void enter_username_and_password_and_click_on_submit(String phoneno, String password) throws Throwable{
		 FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
			obj.load(objfile);
			driver.findElement(By.xpath(obj.getProperty("phone.input"))).sendKeys(phoneno);
			driver.findElement(By.xpath(obj.getProperty("password.input"))).sendKeys(password);
	}

	@Then("^System should be able to login$")
	public void system_should_be_able_to_login() throws Throwable {
		 FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
			obj.load(objfile);
	/*	WebDriverWait obj1=new WebDriverWait(driver, 10);
		obj1.until(ExpectedConditions.elementToBeClickable(signin.btn));*/
			String Text=driver.findElement(By.xpath("(//ul[@class=\"navbar-nav navbar-right\"]/li[1])")).getText();
		
		System.out.print(Text);
	}
}
	
