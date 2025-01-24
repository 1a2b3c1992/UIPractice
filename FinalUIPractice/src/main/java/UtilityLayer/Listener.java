package UtilityLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class Listener extends BaseClass implements ITestListener {

	private ExtentReporter extentreport;
	private ExtentTest extenttest;
	private ExtentReports extentReports ;
	
	@Override
	public void onStart(ITestContext context) {
		String suiteName=context.getSuite().getName();
		extentReports = new ExtentReports();
		String path = System.getProperty("user.dir") + "//ExtentReports//" + DateAndTime.year() + "//"
				+ DateAndTime.dateMonthYear() + "//" + DateAndTime.dateMonthYear() + "//" + suiteName
				+ DateAndTime.getDateTime() + ".html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		extentReports.attachReporter(reporter);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		extenttest = extentReports.createTest(result.getMethod().getMethodName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, "Test Case Pass Name is ::" + result.getMethod().getMethodName());
		try {
			extenttest.addScreenCaptureFromPath(
					TakeScreenshot.capturScreenshot("PassScreenshot", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, "Test case Fail Name is :: " + result.getMethod().getMethodName());

		try {
			extenttest.addScreenCaptureFromPath(
					TakeScreenshot.capturScreenshot("FailScreenshot", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {

		extenttest.log(Status.SKIP, "Test Skip name is " + result.getMethod().getMethodName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}
		
	
}
