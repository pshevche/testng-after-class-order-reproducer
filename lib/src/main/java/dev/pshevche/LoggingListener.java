package dev.pshevche;

import org.testng.*;

public class LoggingListener implements IClassListener, IConfigurationListener, ITestListener {
    @Override
    public void onBeforeClass(ITestClass testClass) {
        System.out.println("onBeforeClass: " + testClass.getName());
    }

    @Override
    public void onAfterClass(ITestClass testClass) {
        System.out.println("onAfterClass: " + testClass.getName());
    }

    @Override
    public void onConfigurationSuccess(ITestResult tr) {
        System.out.println("onConfigurationSuccess: " + tr.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess: " + result.getName());
    }
}
