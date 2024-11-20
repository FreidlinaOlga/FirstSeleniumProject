package com.ait.qa49;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @Test
    public void newUserRegistrationPositiveTest() {
        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);

        //click register link
        click(By.cssSelector("[href='/register']"));
        // enter First name
        type(By.name("FirstName"), "Robert");
        // enter Last name
        type(By.name("LastName"), "Stone");
        // enter email address
        type(By.name("Email"), "test" + i + "@test.com");
        // enter password
        type(By.name("Password"), "Call$88n" );
        // confirm password
        type(By.name("ConfirmPassword"), "Call$88n" );
        // click Register button
        click(By.name("register-button"));
        // Verify Log Out button is displayed
       Assert.assertTrue(isElementPresent(By.xpath("//a[@class='ico-logout']")));

    }
}
