package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.Reporting.ReportGenerator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin= {"json:target/output.json"},tags={"@Login"},dryRun=false,strict=false,monochrome= true,features= {"src/test/resources/"},glue = {"com.stepdefinition"})

public class TestRunner {
	
	@AfterClass
	public static void report() {
		
		ReportGenerator.generateJVMReport("C:\\Users\\Devaraj.V\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64 (1)\\eclipse\\OMRBranchAdactinAutomation\\target\\output.json");

		
	}
	
	
	
	
	
	
	
}
	
	
	


