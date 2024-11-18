package com.ait.qa49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class FindElementTests {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void findElementByTagName() {
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a")); // переменная, чтобы в дальнейшем сократить код
        System.out.println(element1.getText()); // находит только первый элемент из списка, а там нет текста

        //Найти список
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }
    @Test
    public void findElementBySimpleLocators() {
        // by id
       driver.findElement(By.id("city"));
       // by class name
        driver.findElement(By.className("header"));
        // by linkText плохая стратегия
        driver.findElement(By.linkText("Let the car work"));
        driver.findElement(By.partialLinkText("work"));

    }
    @Test
    public void findElementByCssSelectorTest() {
        // Tag name == css
        // id-> css(#)
        driver.findElement(By.cssSelector("#city"));
        //class name -> css(.) Поставить точку перед строкой
        driver.findElement(By.cssSelector(".header"));

        // [attr ='value']
        driver.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));
        // contains частично -// *
        driver.findElement(By.cssSelector("[href*='login']"));
        // start with -> ^
        driver.findElement(By.cssSelector("[href^='/log']"));
        //end -> $
        driver.findElement(By.cssSelector("[href$='search']"));
    }
}
