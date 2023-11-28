package com.ait.qa28.homework6.test;

import com.ait.qa28.homework6.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if (app.getUser().isLoginPresent() ) {
            app.getUser().clickOnLoginLink();
            //form[@action="/login"]
            app.getUser().fillLoginRegisterForm(new User()
                    .setEmail("nameLastname3@gmail.com")
                    .setPassword("Neuer1234$"));
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
