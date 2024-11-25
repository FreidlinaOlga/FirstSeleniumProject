package com.ait.qa49;

import com.demowebshop.models.Contacts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {
        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);
        app.getContacts().clickOnRegisterLink();
        app.getContacts().fillRegisterForm(new Contacts()
                .setFirstName("Robert")
                .setLastName("Stone")
                .setEmail("robert" + i + "@london.com")
                .setPassword("Call$88"));
        app.getContacts().clickOnRegisterButton();
        Assert.assertTrue(app.getContacts().isLogOutButtonPresent());

    }

}
