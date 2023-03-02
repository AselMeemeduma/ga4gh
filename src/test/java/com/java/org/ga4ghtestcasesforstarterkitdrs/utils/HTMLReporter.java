package com.java.org.ga4ghtestcasesforstarterkitdrs.utils;

import org.testng.ITestListener;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;

@Listeners(HTMLReporter.class)
public class HTMLReporter extends TestListenerAdapter implements ITestListener {


}
