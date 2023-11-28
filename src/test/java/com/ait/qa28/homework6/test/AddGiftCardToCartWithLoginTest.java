package com.ait.qa28.homework6.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddGiftCardToCartWithLoginTest extends TestBase {

        //precondition:
        @BeforeMethod
        public void ensurePrecondition(){
            if (app.getUser().isLoginPresent() ) {
                app.getUser().clickOnLoginLink();
                app.getUser().fillLoginRegisterForm("nameLastname3@gmail.com", "Neuer1234$");
                app.getUser().clickOnLoginButton();
              //  pause(1000);
            }
        }
        @Test
        public void AddVirtualGiftCardPositivTest(){
            app.getGiftCard().clickOnAddToCartButton1();
            app.getGiftCard().fillFormGiftCard();

            app.getGiftCard().clickOnAddToCartButton2();
            //The product has been added to your            class="bar-notification success" style="display: none;" xpath="1">
            Assert.assertTrue(app.getGiftCard().isTextProductHasBeenAddedPresent());
        }


}
