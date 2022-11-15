package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",glue = "com.stepdefinition", dryRun = false, monochrome = true,tags = {"@tag"},
plugin = {"pretty","junit:target/notabene.xml","html:target","json:target/output.json"} )
public class TestRunner {
	
	@AfterClass
	public static void afterclass() {

		Reporting.generateReport(System.getProperty("user.dir")+"\\target\\output.json");
	}

}
