package com.ait.qa28.homework4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateNewAccountTests extends TestBase {
    //precondition:
    @BeforeMethod
    public void ensurePrecondition(){
     //   driver.findElement(By.cssSelector("href='/register']")).click();
    }
    @Test
    public void createNewAccountPositivTest(){
        //click on Login link
        driver.findElement(By.cssSelector("[href='/register']")).click();
        //enter //input[@id='gender-female']
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        //enter //input[@id='FirstName']
        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("FirstName1");
        //enter //input[@id='FirstName']
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("LastName1");
        //enter //input[@id='FirstName']
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("nameLastname3@gmail.com");
        //enter password
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Neuer1234$");
        //enter ConfirmPassword
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Neuer1234$");

        //click on Registration button
        driver.findElement(By.name("register-button")).click();

      //  driver.findElement(By.cssSelector(".button-1 register-continue-button")).click();

        Assert.assertTrue(isElementPresent(By.xpath(" //div[contains(text(),'Your registration completed')]")));
    }



}
