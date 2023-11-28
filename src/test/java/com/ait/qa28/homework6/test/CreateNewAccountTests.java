package com.ait.qa28.homework6.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CreateNewAccountTests extends TestBase {
    //precondition:
    @BeforeMethod
    public void ensurePrecondition(){
        if (app.getContact().isRegisterLinkPresent()) {
        }
    }

    @Test
    public void createNewAccountPositivTest(){
        //click on Register link
        app.getContact().clickOnRegisterLink();
        app.getContact().fillRegistrationForm();
        app.getContact().clickOnRegisterButton();

        app.getContact().clickOnRegisterOrContinueButton();

        Assert.assertTrue(app.getUser().isLogoutPresent());
    }

    @Test
    public void createNewAccountwithDoubleEmailNegativTest(){
        app.getContact().clickOnRegisterLink();
        app.getContact().fillRegistrationForm();
        app.getContact().clickOnRegisterButton();
        Assert.assertFalse(app.getContact().isTextRegistrationCompletedPresent());
    }

}
