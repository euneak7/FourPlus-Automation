package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    public static ExtentReports extent;
    public static ExtentTest test;
    public static void startReport(){
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Project", "FourPlus Automation");
        extent.setSystemInfo("Tester", "Euneak");
        extent.setSystemInfo("Environment", "Stage");
        extent.setSystemInfo("Browser", "Chrome");
    }
    // Create a test
    public static void createTest(String testName) {

        test = extent.createTest(testName);
    }

    // End the report
    public static void endReport() {

        extent.flush();
    }
}




