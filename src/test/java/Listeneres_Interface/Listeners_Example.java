package Listeneres_Interface;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


/*
todo implement ITestListener
Then go XML file and let the XML file where you Custom Listeners Class located
Look testng.xml file inside
We have ITestResult class and we can use instance of this class and get all information about failed test.
 */

public class Listeners_Example implements ITestListener {
    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("I successfully passed");
    }

    public void onTestFailure(ITestResult result) {
        System.err.println("I failed");
        //get class name of failed test
        System.out.println(result.getTestClass() + " name of class");
        //get method name of failed test
        System.out.println(result.getName() + " name of failed method");
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
    }
}
