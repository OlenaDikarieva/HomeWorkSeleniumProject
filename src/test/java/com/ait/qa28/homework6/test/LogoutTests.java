package com.ait.qa28.homework6.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if (app.getUser().isLoginPresent() ) {
            app.getUser().clickOnLoginLink();
            //form[@action="/login"]
            app.getUser().fillLoginRegisterForm("nameLastname3@gmail.com", "Neuer1234$");
            //[class="button-1 login-button"]
            app.getUser().clickOnLoginButton();
        }
    }
    @Test
    public void LogoutRegisteredUserPositiveTest(){
        app.getUser().clickOnLogoutLink();
        Assert.assertTrue(app.getUser().isLoginPresent());
    }
}
