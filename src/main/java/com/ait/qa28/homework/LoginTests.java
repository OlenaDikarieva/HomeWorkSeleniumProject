package com.ait.qa28.homework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    //precondition:
    @BeforeMethod
    public void ensurePrecondition(){
//        if (!isLoginPresent()) {
//            clickOnLoginLink();
//        }
    }
    @Test
    public void LoginRegisteredUserPositiveTest(){
        clickOnLoginLink();
        pause(1000);
        //form[@action="/login"]
        fillLoginRegisterForm("nameLastname3@gmail.com", "Neuer1234$");
        //[class="button-1 login-button"]
        clickOnLoginButton();
        pause(1000);
       // [href="/customer/info"] .account
        Assert.assertTrue(isElementPresent(By.cssSelector(".account")));
    }
}
