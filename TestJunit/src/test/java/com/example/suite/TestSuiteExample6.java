package com.example.suite;

import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"com.example.suite.testClass"})
@ExcludeClassNamePatterns({".*2.*"})
@Suite
@SuiteDisplayName("TestSuite6")
public class TestSuiteExample6 {

}