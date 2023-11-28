package com.ait.qa28.homework6.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//app.getContact()
public class LoginTests extends TestBase {
    //precondition:
    @BeforeMethod
    public void ensurePrecondition(){
        if (app.getUser().isLogoutPresent() ) {
            app.getUser().clickOnLogoutLink();
        }
    }
    @Test
    public void LoginRegisteredUserPositiveTest(){
        app.getUser().clickOnLoginLink();
      //  pause(1000);
        app.getUser().fillLoginRegisterForm("nameLastname3@gmail.com", "Neuer1234$");
        app.getUser().clickOnLoginButton();
      //  pause(1000);
        Assert.assertTrue(app.getUser().isAccountPresent());
    }


}
