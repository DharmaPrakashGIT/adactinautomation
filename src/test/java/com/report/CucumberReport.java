package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberReport  {



	public static void adactinReport(String jsonFile) {

		File f=new File("C:\\Users\\SAKTHI.SVMKS\\eclipse-workspace\\MavenCucumber\\target");


		Configuration config=new Configuration(f, "Adactin Automation");

		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Verion", "103");
		config.addClassifications("OS", "WINDOWS 10");

		List<String> l=new ArrayList<String>();
		l.add(jsonFile);

		ReportBuilder report=new ReportBuilder(l, config);
		
		report.generateReports();
			













	}


}
