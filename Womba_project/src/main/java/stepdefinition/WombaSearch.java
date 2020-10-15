package stepdefinition;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class WombaSearch extends ScreenshotsDemo{
	Properties obj=new Properties();
	@When("^Login to Womba$")
	public void login_to_Womba() throws Throwable 
	{
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
	      
	}

	@When("^Check womba applicant filter Firstname \"([^\"]*)\" LastNme \"([^\"]*)\" dob \"([^\"]*)\" Status \"([^\"]*)\" RequesterCaseID \"([^\"]*)\" CompanyName \"([^\"]*)\" AdditionalConsent \"([^\"]*)\" State \"([^\"]*)\" Datasource \"([^\"]*)\" Filterdates \"([^\"]*)\" StartDate \"([^\"]*)\" EndDate \"([^\"]*)\"$")
	public void check_womba_applicant_filter_Firstname_LastNme_dob_Status_RequesterCaseID_InsuranceNo_CompanyName_AdditionalConsent_State_Datasource_Filterdates_StartDate_EndDate(String FirstNmae, String LastNme, String dob, String status, String RequesterCaseID, String CompanyName, String AdditionalConsent, String State, String Datasource, String Filterdates, String StartDate, String EndDate) throws Throwable {
		
		Thread.sleep(20000);
		if(FirstNmae!="Null")
		{
		driver.findElement(By.xpath(obj.getProperty("input.FirstNme"))).sendKeys(FirstNmae);
		}
		if(LastNme!="Null")
		driver.findElement(By.xpath(obj.getProperty("input.LastNme"))).sendKeys(LastNme);
		if(dob!="Null")
			driver.findElement(By.xpath(obj.getProperty("input.dob"))).sendKeys(dob);	
		if(status!="Null")
		{
			driver.findElement(By.xpath("//div[text()=+\"status\"+]"));
			                                         
		}
		if(RequesterCaseID!="Null")
		{
			
		
			driver.findElement(By.xpath(obj.getProperty("input.requesterCase"))).sendKeys(RequesterCaseID);
			}
		
			if(CompanyName!="Null")
			{
				driver.findElement(By.xpath(obj.getProperty(""))).sendKeys(CompanyName);
			}
			if(AdditionalConsent!="Null")
				{
					driver.findElement(By.xpath(obj.getProperty(""))).sendKeys(AdditionalConsent);
				}
				if(State!="Null")
					{
						driver.findElement(By.xpath(obj.getProperty(""))).sendKeys(State);
					}
					if(Datasource!="Null")
						{
							driver.findElement(By.xpath(obj.getProperty(""))).sendKeys(Datasource);
						}	
							if(Filterdates!="Null")
							{
								driver.findElement(By.xpath(obj.getProperty(""))).sendKeys(Filterdates);
							}
	}

}
