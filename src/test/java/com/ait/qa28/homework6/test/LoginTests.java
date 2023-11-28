package com.ait.qa28.homework6.test;

import com.ait.qa28.homework6.models.User;
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
        app.getUser().fillLoginRegisterForm(new User()
                .setEmail("nameLastname3@gmail.com")
                .setPassword("Neuer1234$"));
        app.getUser().clickOnLoginButton();
      //  pause(1000);
        Assert.assertTrue(app.getUser().isAccountPresent());
    }


}
