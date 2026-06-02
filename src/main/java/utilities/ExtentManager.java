package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	static ExtentReports extent;
	
	public static ExtentReports getExtentReports() {
		if(extent == null) {
			ExtentSparkReporter spark = new ExtentSparkReporter("reports/ExtentReport.html");
			
			spark.config().setReportName("Automation Test Results");
			extent = new ExtentReports();
			extent.attachReporter(spark);
		}
		return extent;
	}
}
