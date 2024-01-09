package Listerner;

public class MyListener
    implements org.testng.ITestListener {

        public void onStart(org.testng.ITestContext context) {
            System.out.println("Test Started!!!");
        }

        public void onFinish(org.testng.ITestContext context) {
            System.out.println("Test Finished!!!");
        }

        public void onTestStart(org.testng.ITestResult result) {
            System.out.println("New Test Started" +result.getName());
        }

        public void onTestSuccess(org.testng.ITestResult result) {
            System.out.println("onTestSuccess Method" +result.getName());
        }

        public void onTestFailure(org.testng.ITestResult result) {
            System.out.println("onTestFailure Method" +result.getName());
        }

        public void onTestSkipped(org.testng.ITestResult result) {
            System.out.println("onTestSkipped Method" +result.getName());
        }

        public void onTestFailedButWithinSuccessPercentage(org.testng.ITestResult result) {
            System.out.println("onTestFailedButWithinSuccessPercentage" +result.getName());
        }


}
