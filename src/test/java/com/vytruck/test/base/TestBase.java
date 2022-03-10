package com.vytruck.test.base;

import com.vytruck.utils.ConfigurationReader;
import com.vytruck.utils.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
