package com.ait.qa28.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
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

    public boolean isHomeComponentPresent() {
        return driver.findElements(By.cssSelector("[action='/register']")).size()>0;
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
    public void click(By locator) {
        driver.findElement(locator).click();
    }
    protected boolean isLoginPresent() {
        return isElementPresent(By.cssSelector("[href='/login']"));
    }
    public void clickOnLoginLink() {
            click(By.cssSelector("[href='/login']"));
        }
    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
    public void fillLoginRegisterForm(String email, String password) {
        type(By.cssSelector("[name='Email']"), email);
        type(By.cssSelector("[name='Password']"), password);
    }
    protected void clickOnLoginButton() {
        click(By.xpath("//input[@class='button-1 login-button']"));
       // click(By.cssSelector(".button-1 login-button"));
       // click(By.cssSelector("//input[@class='button-1 login-button']"));
    }

    public void pause(int millis)  {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

