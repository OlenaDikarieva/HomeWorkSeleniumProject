package com.ait.qa28.homework6.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCardHelper extends BaseHelper{
    WebDriver driver;

    public GiftCardHelper(WebDriver driver) {
        super(driver);
    }
    public boolean isTextProductHasBeenAddedPresent() {
        return isElementPresent(By.xpath(" //p[@class='content']"));
    }

    public void clickOnAddToCartButton2() {
        click(By.xpath("//input[@id='add-to-cart-button-2']"));
    }

    public void fillFormGiftCard() {
        type(By.name("giftcard_2.RecipientName"), "RecipientName1");
        type(By.name("giftcard_2.RecipientEmail"), "RecipientEmail@gmail.com");
    }

    public void clickOnAddToCartButton1() {
        click(By.xpath("//div[@class='product-item'][@data-productid='2']//input[@class='button-2 product-box-add-to-cart-button']"));
    }

}
