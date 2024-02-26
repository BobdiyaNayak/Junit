package com.example.suite;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"com.example.calc"})
@IncludeTags({"addition"})
@Suite
@SuiteDisplayName("TestSuite3")
public class TestSuiteExample3 {

}