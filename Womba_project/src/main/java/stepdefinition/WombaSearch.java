package stepdefinition;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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


@When("^Check womba applicant filter Firstname \"([^\"]*)\" LastNme \"([^\"]*)\" dob \"([^\"]*)\" Status \"([^\"]*)\" RequesterCaseID \"([^\"]*)\" tarcking no \"([^\"]*)\"CompanyName \"([^\"]*)\" AdditionalConsent \"([^\"]*)\" State \"([^\"]*)\" Datasource \"([^\"]*)\" Filterdates \"([^\"]*)\" StartDate \"([^\"]*)\" EndDate \"([^\"]*)\"$")
	public void check_womba_applicant_filter_Firstname_LastNme_dob_Status_RequesterCaseID_InsuranceNo_CompanyName_AdditionalConsent_State_Datasource_Filterdates_StartDate_EndDate(String FirstNmae, String LastNme, String dob, String status, String RequesterCaseID,String TrackingNo, String CompanyName, String AdditionalConsent, String State, String Datasource, String Filterdates, String StartDate, String EndDate) throws Throwable {
		
		Thread.sleep(10000);
		if(!FirstNmae.equals("null"))
		{
		driver.findElement(By.xpath(obj.getProperty("input.FirstNme"))).sendKeys(FirstNmae);
		}
		if(!LastNme.equals("null"))
		driver.findElement(By.xpath(obj.getProperty("input.LastNme"))).sendKeys(LastNme);
		if(!dob.equals("null"))
		{
			
		//	int dob1=Integer.parseInt(dob);
		
			driver.findElement(By.xpath(obj.getProperty("input.dob"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(obj.getProperty("input.dob"))).sendKeys(dob);}
			/*
		String Year=dob.substring(4,8);
		int yeaR=Integer.parseInt(Year);
		String Month=dob.substring(0,2);
	int MontH=Integer.parseInt(Month);
		String Day=dob.substring(2,4);
				System.out.print(Year);
				System.out.print(Month);
				if(MontH==1)
				{
					Month ="January";
				}
				if(MontH==2)
				{
					Month ="February";
				}
				
				if(MontH==3)
				{
					Month ="March";
				}
				if(MontH==4)
				{
					Month ="April";
				}
				if(MontH==5)
				{
					Month ="May";
				}
				if(MontH==6)
				{
					Month ="June";
				}
				if(MontH==7)
				{
					Month="July";
				}
				if(MontH==8)
				{
					Month="August";
				}
				if(MontH==9)
				{
					Month="September";
				}
				if(MontH==10)
				{
					Month="October";
	}
				if(MontH==11)
				{Month="November";
				
				}
				if(MontH==12)
				{
					Month="December";
				}
				
	
				Thread.sleep(2000);
				String year=
		driver.findElement(By.xpath(obj.getProperty("btn.year"))).getText();
				String month=
				driver.findElement(By.xpath(obj.getProperty("btn.month"))).getText();
				boolean t;
				while(Year!=year&&Month!=month)
				{
					driver.findElement(By.xpath(obj.getProperty("btn.prev"))).click();
				}
		}*/
		
				
		/*	Thread.sleep(5000);
				WebElement yearDropDown= driver.findElement(By.xpath("//*[@class='xdsoft_label xdsoft_year']"));
				Select selectYear= new Select(yearDropDown);
				selectYear.selectByVisibleText(Year);
			driver.findElement(By.xpath("//div[text()='" +Year+ "']")).click();*/
				
		if(!status.equals("null"))
		{
			driver.findElement(By.xpath(obj.getProperty("dropdown.status"))).click();
			driver.findElement(By.xpath("//*[text()='"+status+"']")).click();
			                                         
		}
		if(!RequesterCaseID.equals("null"))
		{
			
		
			driver.findElement(By.xpath(obj.getProperty("input.requesterCase"))).sendKeys(RequesterCaseID);
			}
		
			if(!CompanyName.equals("null"))
			{
				driver.findElement(By.xpath(obj.getProperty("input.organizationname"))).sendKeys(CompanyName);
			}
			if(!TrackingNo.equals("null"))
			{
				driver.findElement(By.xpath(obj.getProperty("input.TrackingNo"))).sendKeys(TrackingNo);
			}
			if(!Datasource.equals("null"))
			{
				driver.findElement(By.xpath(obj.getProperty("dropdown.datasource"))).click();
				driver.findElement(By.xpath("//*[text()='"+Datasource+"']")).click();
			}	
	/*		if(AdditionalConsent!="Null")
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
							}*/
	}
	
}
