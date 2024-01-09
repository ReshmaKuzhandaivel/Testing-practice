package Listerner;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestResult;
public class Extentrepoterlistener implements org.testng.ITestListener {

        private static final String OUTPUT_FOLDER = "./test-reports/";
        private static final String FILE_NAME = "AutomationReport.html";

        private static ExtentReports extent = init();
        public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
        private static ExtentReports extentReports;


        private static ExtentReports init() {

            java.nio.file.Path path = java.nio.file.Paths.get(OUTPUT_FOLDER);
            // if directory exists?
            if (!java.nio.file.Files.exists(path)) {
                try {
                    java.nio.file.Files.createDirectories(path);
                } catch (java.io.IOException e) {
                    // fail to create directory
                    e.printStackTrace();
                }
            }

            extentReports = new ExtentReports();
            ExtentSparkReporter reporter = new ExtentSparkReporter(OUTPUT_FOLDER + FILE_NAME);
            reporter.config().setReportName("Orange HRM Automation Test Results");
            extentReports.attachReporter(reporter);
            extentReports.setSystemInfo("System", "MAC M2");
            extentReports.setSystemInfo("Author", "https://github.com/ganeshk627");
            extentReports.setSystemInfo("Build", "1.1");
            extentReports.setSystemInfo("Team", "QA");

//        extentReports.setSystemInfo("ENV NAME", System.getProperty("env"));

            return extentReports;
        }

        @Override
        public synchronized void onStart(org.testng.ITestContext context) {
            System.out.println("Test Suite started!");

        }

        @Override
        public synchronized void onFinish(org.testng.ITestContext context) {
            System.out.println(("Test Suite is ending!"));
            extent.flush();
            test.remove();

            // To open report automatically after execution
//        try {
//            Desktop.getDesktop().browse(new File(OUTPUT_FOLDER + FILE_NAME).toURI());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        }

        @Override
        public synchronized void onTestStart(org.testng.ITestResult result) {
            String methodName = result.getMethod().getMethodName();
            String qualifiedName = result.getMethod().getQualifiedName();
            int last = qualifiedName.lastIndexOf(".");
            int mid = qualifiedName.substring(0, last).lastIndexOf(".");
            String className = qualifiedName.substring(mid + 1, last);

            System.out.println(methodName + " started!");
            ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName(),
                    result.getMethod().getDescription());

            extentTest.assignCategory(result.getTestContext().getSuite().getName());
            /*
             * methodName = StringUtils.capitalize(StringUtils.join(StringUtils.
             * splitByCharacterTypeCamelCase(methodName), StringUtils.SPACE));
             */
            extentTest.assignCategory(className);
            test.set(extentTest);
            test.get().getModel().setStartTime(getTime(result.getStartMillis()));
        }

        public synchronized void onTestSuccess(org.testng.ITestResult result) {
            System.out.println((result.getMethod().getMethodName() + " passed!"));
            test.get().pass("Test passed!");
//        test.get().pass(result.getThrowable(),MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
            test.get().getModel().setEndTime(getTime(result.getEndMillis()));
        }

        public synchronized void onTestFailure(ITestResult result) {
            System.out.println((result.getMethod().getMethodName() + " failed!"));
            test.get().fail("Test failed!");
//        test.get().fail(result.getThrowable(),MediaEntityBuilder.createScreenCaptureFromBase64String(takeScreenshot()).build());
            test.get().getModel().setEndTime(getTime(result.getEndMillis()));
        }

        public synchronized void onTestSkipped(org.testng.ITestResult result) {
            System.out.println((result.getMethod().getMethodName() + " skipped!"));
            test.get().getModel().setEndTime(getTime(result.getEndMillis()));
        }

        public synchronized void onTestFailedButWithinSuccessPercentage(org.testng.ITestResult result) {
            System.out.println(("onTestFailedButWithinSuccessPercentage for " + result.getMethod().getMethodName()));
        }

        private java.util.Date getTime(long millis) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(millis);
            return calendar.getTime();
        }

    }



