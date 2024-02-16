package com.example.suite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"com.example.calc"})
@Suite
@SuiteDisplayName("TestSuite")
public class TestSuiteExample {

}