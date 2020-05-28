package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewIncomingEmailPage extends BasePage {

    @FindBy(xpath = "//div[@class='to']/div[@class='field_value']")
    private WebElement lbEmailRecipient;

    public String getLbEmailRecipient() {
        return lbEmailRecipient.getText();
    }
}
