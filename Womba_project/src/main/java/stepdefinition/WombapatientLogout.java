package stepdefinition;

 

import java.io.FileInputStream;
import java.util.Properties;

 

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

 

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

 

public class WombapatientLogout extends ScreenshotsDemo{
    Properties obj=new Properties();
    @Given("^User should be already logged in$")
    public void user_should_be_already_logged_in() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");

 

        driver=new ChromeDriver();
    driver.get("https://eu-womba-qa.dunnsolutions.com");
        driver.manage().window().maximize();
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config\\configuration.properties");
        obj.load(objfile);
        Thread.sleep(10000);
        driver.findElement(By.xpath(obj.getProperty("input.username"))).sendKeys("hsx@womba.com");
        
        driver.findElement(By.xpath(obj.getProperty("input.password"))).sendKeys("Password123@");
        driver.findElement(By.xpath(obj.getProperty("signIn.btn"))).click();
        Thread.sleep(10000);
    }

 

    @Given("^User click on loggout button$")
    public void user_click_on_loggout_button() throws Throwable {
        driver.findElement(By.xpath(obj.getProperty("useremail.dropdown"))).click();
        driver.findElement(By.xpath(obj.getProperty("logout.btn"))).click();
        Thread.sleep(10000);
    
    }

 

    @Then("^User should be able to logout succesfully$")
    public void user_should_be_able_to_logout_succesfully() throws Throwable {
        String Textsign="Sign In";
    String textretrived=    driver.findElement(By.xpath(obj.getProperty("Signin.btn.text"))).getText();
        
       Assert.assertEquals(Textsign, textretrived); 
       
    }

 

 

}