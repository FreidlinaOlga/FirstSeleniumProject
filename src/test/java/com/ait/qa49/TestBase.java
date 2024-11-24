package com.ait.qa49;

import com.demowebshop.fw.AppManager;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static AppManager app = new AppManager(System.getProperty("browser",
            Browser.CHROME.browserName()));

    @BeforeSuite
    public void setUp() {
        app.init();
    }


    @AfterSuite
    public void tearDown() {
        app.stop();
    }

}
