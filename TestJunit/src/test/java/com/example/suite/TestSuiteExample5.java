package com.example.suite;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"com.example.suite.testClass"})
@IncludeClassNamePatterns({".*2.*"})
@Suite
@SuiteDisplayName("TestSuite5")
public class TestSuiteExample5 {

}