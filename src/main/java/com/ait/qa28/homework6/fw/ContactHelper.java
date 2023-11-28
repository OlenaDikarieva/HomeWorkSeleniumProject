package com.ait.qa28.homework6.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactHelper extends BaseHelper{
    public ContactHelper(WebDriver driver) {
        super(driver);
    }
    public void fillRegistrationForm() {
        click(By.xpath("//input[@id='gender-female']"));
        type(By.name("FirstName"),"FirstName1");
        type(By.name("LastName"),"LastName1");
        type(By.name("Email"),"nameLastname4@gmail.com");
        type(By.name("Password"),"Neuer1234$");
        type(By.name("ConfirmPassword"),"Neuer1234$");
    }

    public void clickOnRegisterButton() {
        click(By.name("register-button"));
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnRegisterOrContinueButton() {
        click(By.xpath("//input[@class='button-1 register-continue-button']"));
    }

    public boolean isRegisterLinkPresent() {
        return isElementPresent(By.cssSelector("[href='/register']"));
    }
    public boolean isTextRegistrationCompletedPresent() {
        return isElementPresent(By.xpath(" //div[contains(text(),'Your registration completed')]"));
    }
}
