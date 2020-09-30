package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/feature/WombapatientLogin.feature",
glue= { "stepdefinition" })
@Test
public class TestRunner {
	
	
	

	}