package com.ait.qa49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public boolean isLogOutButtonPresent() {
        return isElementPresent(By.xpath("//a[@class='ico-logout']"));
    }

    public void clickOnRegisterButton() {
        click(By.name("register-button"));
    }

    public void fillRegisterForm(Contacts contacts) {
        type(By.name("FirstName"), contacts.getFirstName());
        // enter Last name
        type(By.name("LastName"), contacts.getLastName());
        // enter email address
        type(By.name("Email"), contacts.getEmail());
        // enter password
        type(By.name("Password"), contacts.getPassword());
        // confirm password
        type(By.name("ConfirmPassword"), contacts.getPassword());
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }
}
