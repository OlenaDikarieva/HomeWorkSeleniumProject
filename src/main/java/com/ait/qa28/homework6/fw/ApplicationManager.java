package com.ait.qa28.homework6.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager{

    WebDriver driver;
    UserHelper user;
    ContactHelper contact;
    GiftCardHelper giftcard;

    public void init() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        user=new UserHelper(driver);
        contact=new ContactHelper(driver);
        giftcard=new GiftCardHelper(driver);
    }

    public UserHelper getUser() {
        return user;
    }

    public ContactHelper getContact() {
        return contact;
    }

    public GiftCardHelper getGiftCard() {
        return giftcard;
    }

    public void stop() {
        driver.quit();
    }


}