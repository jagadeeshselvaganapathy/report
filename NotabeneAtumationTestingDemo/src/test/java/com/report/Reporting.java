package com.report;


import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	
		public static void generateReport(String jsonFile) {

		//mention report location
		File f = new File(System.getProperty("user.dir")+"\\target");
		Configuration c = new Configuration(f, "NotaBene");
		c.addClassifications("plateformName", "Windows");
		c.addClassifications("platformVersion", "10");
		
		
		

		List<String> jsonFile1 = new LinkedList<String>();
		jsonFile1.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFile1,c);
		builder.generateReports();

		}
		}


