package com.stormnet.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;
import utility.Logger;
import org.testng.ITestContext;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CustomTestNgListener implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result){
		Logger.getLogger().info("Test {} finished. ", result.getTestName());
	}

	@Override
	public void onTestFailure(ITestResult result){
		Logger.getLogger().error("Test {} finished. STATUS: FAILED", result.getTestName(), result.getThrowable());
	}
	@Override
	public void onStart(ITestContext context) {
		Logger.getLogger().debug("On start method called");
	}

}
