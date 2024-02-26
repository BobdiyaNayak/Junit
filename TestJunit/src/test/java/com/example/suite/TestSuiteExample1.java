package com.example.suite;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"com.example.calc"})
@ExcludePackages("com.example.calc.adv")
@ExcludeTags("addition")
@Suite
@SuiteDisplayName("TestSuite1")
public class TestSuiteExample1 {

}