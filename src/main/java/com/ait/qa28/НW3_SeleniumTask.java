package com.ait.qa28;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class НW3_SeleniumTask {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByCssTest() {
        System.out.println("++++++++++++By.cssSelectort++++++++++++++");
        List<WebElement> elements = driver.findElements(By.cssSelector(".title"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }

        WebElement element1 =driver.findElement(By.cssSelector("#dialog-notifications-error"));

        WebElement element2 = driver.findElement(By.cssSelector("#dialog-notifications-success"));

        WebElement element3 = driver.findElement(By.cssSelector("#bar-notification"));

        WebElement element4 = driver.findElement(By.cssSelector("..master-wrapper-page"));

        WebElement element5 = driver.findElement(By.cssSelector(".master-wrapper-content"));
    }

    @Test
    public void findElementByXpath() {
        //xpath-->//
        System.out.println("++++++++++++By.ByXpath++++++++++++++");
        List<WebElement> elementsByXPath = driver.findElements(By.xpath("//title"));
        for (WebElement element : elementsByXPath) {
            System.out.println(element.getText());
        }

        WebElement element =driver.findElement(By.xpath("//title[contains(.,'Demo Web Shop')]"));
        System.out.println(element.getText());

        WebElement element1 =driver.findElement(By.xpath(("//div[@id='dialog-notifications-error']")));

        WebElement element2 =driver.findElement(By.xpath(("//div[@class='search-box']")));

        WebElement element3 =driver.findElement(By.xpath(("//div[@class='header-links']")));

        WebElement element4 =driver.findElement(By.xpath(("//div[@id='bar-notification']")));

        WebElement element5 =driver.findElement(By.xpath(("//div[@id='dialog-notifications-success']")));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}