package com.ait.qa28.homework6.fw;

import com.ait.qa28.homework6.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
    WebDriver driver;

    public UserHelper(WebDriver driver) {
        super(driver);
    }
    public boolean isLoginPresent() {
        return isElementPresent(By.cssSelector("[href='/login']"));
    }
    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }
    public boolean isLogoutPresent() {
        return isElementPresent(By.cssSelector("[href='/logout']"));
    }
    public void clickOnLogoutLink() {
        click(By.cssSelector("[href='/logout']"));
    }
    protected boolean isLogOutLinkPresent() {
        return isElementPresent(By.xpath("//a[@href='/logout']"));
    }

    public boolean isAccountPresent() {
        return isElementPresent(By.cssSelector(".account"));
    }
    public void fillLoginRegisterForm(User user) {
        type(By.cssSelector("[name='Email']"), user.getEmail());
        type(By.cssSelector("[name='Password']"),  user.getPassword());
    }
    public void clickOnLoginButton() {
        click(By.xpath("//input[@class='button-1 login-button']"));
    }

}
