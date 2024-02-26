package com.example.suite;

import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages("com.example.area")
@IncludePackages("com.example.area.param")
@Suite
@SuiteDisplayName("TestSuite2")
public class TestSuiteExample2 {

}