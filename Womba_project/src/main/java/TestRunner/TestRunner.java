package TestRunner;

 


import org.junit.runner.RunWith;
import org.testng.annotations.Test;

 

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/feature/WombapatientLogout.feature",tags="@gggg",
glue= { "stepdefinition" })
@Test
public class TestRunner extends AbstractTestNGCucumberTests{
    
    
    

 

    }