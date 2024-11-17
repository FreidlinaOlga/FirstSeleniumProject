package com.ait.qa49;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;

public class FirstSeleniumTest {
    WebDriver driver;

    //before method - setUp (или init)
    @BeforeMethod //гарантия отработки вначале
    public void setUp() {
        driver = new ChromeDriver();
        // driver.get("https://www.google.com"); // без истории
        // maximize browser to window
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com"); //с историей
        // wait for all elements on the site to load before starting test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://ilcarro.web.app");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh(); // обновлять


    }

    //test - название четкое и прозрачное
    @Test
    public void openGoogleTest() {
        System.out.println("Google opened!");
    }

    //after -tearDown

    @AfterMethod(enabled = true) // Enabled позволяет отменять или запускать послетестовое действие
    public void tearDown() {
        // driver.quit(); закрывает все вкладки и браузер
        driver.close(); // закрывает текущую вкладку, если открыта одна вкладка, то закроется и браузер
    }

}
