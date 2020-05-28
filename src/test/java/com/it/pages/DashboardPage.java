package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement ldUserEmail;

    @FindBy(xpath = "(//div//p/a)[1]")
    private WebElement btnCreateLetter;

    @FindBy(xpath = "(//span[@class='frm'])[1]")
    private WebElement btnNewIncomingEmail;

    public void btnClickNewEmail() {
        btnNewIncomingEmail.click();
    }

    public String getLbUserEmail() {
        return ldUserEmail.getText();
    }

    public void btnClickCreateLetter() {
        btnCreateLetter.click();
    }


}
