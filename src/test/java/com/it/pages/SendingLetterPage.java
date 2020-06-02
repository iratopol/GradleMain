package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

public class SendingLetterPage extends BasePage {

    @FindBy(xpath = "//li[@class='sn_menu_item ' ] [1]/a")
    private WebElement btnEmails;

    @FindBy(xpath = "//div[@class='block_confirmation']/div[5]")
    private WebElement lbEmailSentSuccess;

    public void btnClickEmails() {
        btnEmails.click();
    }

    public String getLbEmailSentSuccess() {
       return lbEmailSentSuccess.getText();
    }
}
