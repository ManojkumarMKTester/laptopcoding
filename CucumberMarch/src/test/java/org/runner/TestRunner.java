package org.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",
glue="org.stepdefinition", 
//dryRun its give changes scanario snippets code
dryRun=false,
 plugin = { "pretty" , "usage" } )
public class TestRunner {

}
