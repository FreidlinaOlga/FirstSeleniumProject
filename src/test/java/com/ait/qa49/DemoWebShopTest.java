package com.ait.qa49;

import org.openqa.selenium.By;
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

    @Test
    public void findElementBySimpleLocatorsTest() {
        driver.findElement(By.id("dialog-notifications-error"));
        driver.findElement(By.className("master-wrapper-page"));
        driver.findElement(By.linkText("Compare products list"));
        driver.findElement(By.partialLinkText("products"));

    }

    @Test
    public void findElementByCssSelectorsTest() {
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector(".master-wrapper-page"));

        driver.findElement(By.cssSelector("[href*='nopcommerce']"));
        driver.findElement(By.cssSelector("[href='http://www.nopcommerce.com/']"));
        driver.findElement(By.cssSelector("[href^='http']"));
        driver.findElement(By.cssSelector("[href$='com']"));


    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
