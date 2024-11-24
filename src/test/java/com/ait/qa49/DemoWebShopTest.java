package com.ait.qa49;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoWebShopTest extends TestBase {


    @Test
    public void findElementBySimpleLocatorsTest() {
        app.driver.findElement(By.id("dialog-notifications-error"));
        app.driver.findElement(By.className("master-wrapper-page"));
        app.driver.findElement(By.linkText("Compare products list"));
        app.driver.findElement(By.partialLinkText("products"));

    }

    @Test
    public void findElementByCssSelectorsTest() {
        app.driver.findElement(By.cssSelector("#dialog-notifications-error"));
        app.driver.findElement(By.cssSelector(".master-wrapper-page"));

        app.driver.findElement(By.cssSelector("[href*='nopcommerce']"));
        app.driver.findElement(By.cssSelector("[href='http://www.nopcommerce.com/']"));
        app.driver.findElement(By.cssSelector("[href^='http']"));
        app.driver.findElement(By.cssSelector("[href$='com']"));

    }

    @Test
    public void findElementByXPathTest() {
        app.driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        app.driver.findElement(By.xpath("//h2[contains(.,'Welcome')]"));
        app.driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        app.driver.findElement(By.xpath("//div[@class='master-wrapper-page']"));
        app.driver.findElement(By.xpath("//div[@class='product-item']"));
        app.driver.findElement(By.xpath("//a[text()='Build your own computer']"));
        app.driver.findElement(By.xpath("//a[.='Privacy Notice']"));
        app.driver.findElement(By.xpath("//script[starts-with(@type,'te')]"));
        app.driver.findElement(By.xpath("//div[starts-with(@title,'Error')]"));
        app.driver.findElement(By.xpath("//div[@class='column customer-service']/.."));
        app.driver.findElement(By.xpath("//h2/parent::*"));
        app.driver.findElement(By.xpath("//h2/.."));
        app.driver.findElement(By.xpath("//h2/ancestor::div"));
        app.driver.findElement(By.xpath("//h2/ancestor::div[2]"));
        app.driver.findElement(By.xpath("//h2/following-sibling::div"));
        app.driver.findElement(By.cssSelector("[href='/register']"));
        app.driver.findElement(By.xpath("//input[@type='submit']"));

    }

}
