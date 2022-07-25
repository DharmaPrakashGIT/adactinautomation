package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.CucumberReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:target\\output.json"},monochrome=true,features= {"src\\test\\resources"},glue= {"com.stepdefinition"})
public class TestRunnerClass {

	
	@AfterClass
	public static void afterClass() {

	CucumberReport.adactinReport("C:\\Users\\SAKTHI.SVMKS\\eclipse-workspace\\MavenCucumber\\target\\output.json");
	}
	
}
