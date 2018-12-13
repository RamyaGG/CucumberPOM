package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "H:\\Edureka\\Selenium\\WorkSpace\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\freecrm.feature", // the path of the feature files
																																
		glue = { "com/qa/stepDefinitions" }, // the path of the step definition files(package name)
		
		format = { "pretty", "html:test-output", "json:json-output/cucumber.jason", "junit:junit-xml/cucumber.xml" }, // to generate different types of reporting. Eg to genearate json file report then use json:json-output/cucumber.jason 
		
		monochrome = true, //if it is true then it will generate pretty output in a proper readabe format
		
		strict = true, //it will check if any step is not defined in step definition files
					   // true means it will fail the execution if there are any undefined or pending steps are there
		               // if true and steps are missing the we will get PendingException: todo implement me
		
		dryRun = false // to check the mapping is proper between feature file and step def file. 
						// True means we will get to know which method is missing and it will not execute the test case
						// In order to execute the test case we should make dryRun as false
     //   tags = {"~@SmokeTest" , "~@RegressionTest","~@End2End"}
)

public class TestRunner {

}

     //ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest

//How to ignore a specific test case
// ~@SmokeTest -- this will ignore the @SmokeTest 