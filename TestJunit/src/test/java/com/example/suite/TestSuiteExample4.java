package com.example.suite;

import com.example.suite.testClass.HelloTest;
import com.example.suite.testClass.HelloTest2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectClasses({HelloTest.class, HelloTest2.class})
@Suite
@SuiteDisplayName("TestSuite4")
public class TestSuiteExample4 {

}