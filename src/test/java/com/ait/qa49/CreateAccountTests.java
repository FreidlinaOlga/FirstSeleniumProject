package com.ait.qa49;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);
        clickOnRegisterLink();
        fillRegisterForm(new Contacts()
                .setFirstName("Robert")
                .setLastName("Stone")
                .setEmail("robert@london.com")
                .setPassword("Call$88"));
        clickOnRegisterButton();
        Assert.assertTrue(isLogOutButtonPresent());

    }

}
