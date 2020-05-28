package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLetterPage extends BasePage {

    @FindBy(id = "to")
    private WebElement inputRecipient;

    @FindBy(name = "subject")
    private WebElement inputLetterSubject;

    @FindBy(id = "text")
    private WebElement inputLetterBody;

    @FindBy(xpath = "//span[@swclass='link cancel']")
    private WebElement btnAttachFile;

    @FindBy(xpath = "(//input[@name='send'])[1] | //input[@tabindex='12']")
    private WebElement btnSend;

    protected void setInputRecipient(String email) {
        inputRecipient.sendKeys(email);
    }

    protected void setInputLetterSubject(String subject) {
        inputLetterSubject.sendKeys(subject);
    }

    protected void setInputLetterBody(String body) {
        inputLetterBody.sendKeys(body);
    }

    protected void btnClickAttachFile() {
        btnAttachFile.click();
    }

    protected void btnClickSend() {
        btnSend.click();
    }

}
