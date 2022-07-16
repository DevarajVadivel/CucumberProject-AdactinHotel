package com.Reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGenerator {
	
	public static void generateJVMReport(String Jsonfile) {
		
		File file = new File("C:\\Users\\Devaraj.V\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64 (1)\\eclipse\\OMRBranchAdactinAutomation\\target");	
		
		Configuration config = new Configuration(file,"Adaction Hotel Automation");
		
		config.addClassifications("Browser","Chrome");
		config.addClassifications("Version","109");
		config.addClassifications("OS","Windows");
		config.addClassifications("Last updated","04-07-2022");
		
		List<String> Jsonfiles = new ArrayList<String>();
		Jsonfiles.add(Jsonfile);
		
		ReportBuilder reportbuilder = new ReportBuilder(Jsonfiles, config);
		
		reportbuilder.generateReports();


}
}