package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	public static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("Lori App Test Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Organization Name", "Seasia Infotech");
        extentReports.setSystemInfo("Author", "Chandra Mouli");
        return extentReports;
    }

}
