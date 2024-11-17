package com.ait.qa49;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoWebShopTest {
WebDriver driver;
@BeforeMethod
    public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Test
    public void openDemoWebShopTest() {
    System.out.println("Demo web shop is opened!");

}
@AfterTest
    public void tearDown() {
    driver.close();
}
}
