package com.Ao.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // The path of feature file
        glue = {"com/Ao/stepDefinations"}, // The path of stepDefs file
        plugin = {"pretty", "html:target/cucumber/cucumber-html-report", "json:target/Report/cucumber.json"}, //Reports in html, xml and json formats
        monochrome = true, //display the console output in a proper readable format
        strict = true, //it will check if any step is not defined in step definition file
        dryRun = false) //to check the mapping is proper between feature file and step def file

public class runnerClass {

}

//======================================================================================================================
//=======================run maven project via command line================================
// Check JAVA installed and configured and added into the path -- Java -version
// Check  Maven Download and extracted and added into the path -- mvn --version

// 1. Go to root project directory example C:\Users\Raghavender Mutpuri\IdeaProjects\
// 2. mvn clean compile integration-test test

//======================================================================================================================
