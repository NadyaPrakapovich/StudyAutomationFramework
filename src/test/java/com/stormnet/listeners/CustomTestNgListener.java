package com.stormnet.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CustomTestNgListener implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result){
		System.out.println("Test ok"+result.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult result){
		System.out.println("Test failed"+result.getStatus());
	}

}
