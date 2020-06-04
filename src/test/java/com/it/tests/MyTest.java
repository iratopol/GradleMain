package com.it.tests;

import com.it.emails.EmailFactory;
import com.it.pages.AllureLogger;
import com.it.pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyTest extends BaseTest {
    private SoftAssert softAssert = new SoftAssert();

    @Test
    public void test1() throws InterruptedException {
        //System.out.println(UserFactory.getRandomUsers(10));
        app.login.login(validUser);
        app.common.takeScreenShot();
        AllureLogger.logToAllure("My logs");
        Assert.assertEquals(app.dashboard.getLbUserEmail(), validUser.email);
    }

    @Test
    public void test2() {
        System.out.println(EmailFactory.getRandomEmails(10));
        app.dashboard.btnClickCreateLetter();
        app.createLetter.sendEmail(validEmail);
        softAssert.assertEquals(app.sendingLetter.getLbEmailSentSuccess(), "Письмо успешно отправлено адресатам");
        app.sendingLetter.btnClickEmails();
        app.dashboard.btnClickNewEmail();
        app.common.takeScreenShot();
        softAssert.assertEquals(app.newIncomingEmail.getLbEmailRecipient(), validEmail.emailRecipient);
        softAssert.assertAll();
    }
}
