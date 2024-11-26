package com.ait.qa49;

import com.demowebshop.models.Contacts;
import com.demowebshop.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        if (app.getContacts().isLogOutButtonPresent()) {
            app.getContacts().clickOnLogOutButton();
        }
    }
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

    @Test(dataProvider = "createNewAccountWithCsv", dataProviderClass = DataProviders.class)
    public void newRegistrationPositiveFromDataProviderWithCsvFileTest(Contacts contacts) {

        app.getContacts().clickOnRegisterLink();
        app.getContacts().fillRegisterForm(contacts);
        app.getContacts().clickOnRegisterButton();
        Assert.assertTrue(app.getContacts().isLogOutButtonPresent());

    }
}
