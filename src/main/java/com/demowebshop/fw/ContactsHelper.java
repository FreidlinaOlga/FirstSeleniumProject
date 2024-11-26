package com.demowebshop.fw;

import com.demowebshop.models.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsHelper extends BaseHelper {

    public ContactsHelper(WebDriver driver) {
        super(driver);

    }

    public boolean isLogOutButtonPresent() {
        return isElementPresent
                (By.xpath("//a[@class='ico-logout']"));
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

    public void clickOnLogOutButton() { click
            (By.xpath("//a[@class='ico-logout']"));
    }
}
