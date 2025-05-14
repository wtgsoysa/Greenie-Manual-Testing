package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentTest createTest(String testName) {
        if (extent == null) {
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-reports/GreenieExtentReport.html");
            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
        }
        return extent.createTest(testName);
    }

    public static void flushReports() {
        if (extent != null) {
            extent.flush();
        }
    }
}
