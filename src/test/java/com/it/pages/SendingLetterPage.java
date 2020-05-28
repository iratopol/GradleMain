package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendingLetterPage extends BasePage {

    @FindBy(xpath = "//li[@class='sn_menu_item ' ] [1]/a")
    private WebElement btnEmails;

    @FindBy(xpath = "(//div[@class='content clear']) [1]")
    private WebElement lbEmailSentSuccess;

    public void btnClickEmails() {
        btnEmails.click();
    }

    public void getLbEmailSentSuccess() {
        lbEmailSentSuccess.getText();
    }
}
