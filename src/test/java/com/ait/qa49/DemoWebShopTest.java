package com.ait.qa49;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoWebShopTest extends TestBase {


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

    @Test
    public void findElementByXPathTest() {
        driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        driver.findElement(By.xpath("//h2[contains(.,'Welcome')]"));
        driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//div[@class='product-item']"));
        driver.findElement(By.xpath("//a[text()='Build your own computer']"));
        driver.findElement(By.xpath("//a[.='Privacy Notice']"));
        driver.findElement(By.xpath("//script[starts-with(@type,'te')]"));
        driver.findElement(By.xpath("//div[starts-with(@title,'Error')]"));
        driver.findElement(By.xpath("//div[@class='column customer-service']/.."));
        driver.findElement(By.xpath("//h2/parent::*"));
        driver.findElement(By.xpath("//h2/.."));
        driver.findElement(By.xpath("//h2/ancestor::div"));
        driver.findElement(By.xpath("//h2/ancestor::div[2]"));
        driver.findElement(By.xpath("//h2/following-sibling::div"));
        driver.findElement(By.cssSelector("[href='/register']"));
        driver.findElement(By.xpath("//input[@type='submit']"));

    }

}
