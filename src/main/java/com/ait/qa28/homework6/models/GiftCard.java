package com.ait.qa28.homework6.models;

import org.openqa.selenium.By;

public class GiftCard {
    private  String RecipientName;
    private  String RecipientEmail;

    public GiftCard setRecipientName(String recipientName) {
        RecipientName = recipientName;
        return this;
    }

    public GiftCard setRecipientEmail(String recipientEmail) {
        RecipientEmail = recipientEmail;
        return this;
    }

    public String getRecipientName() {
        return RecipientName;
    }

    public String getRecipientEmail() {
        return RecipientEmail;
    }
}
