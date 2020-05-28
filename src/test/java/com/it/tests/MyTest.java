package com.it.tests;

import com.it.emails.EmailFactory;
import com.it.users.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    @Test
    public void test1() {
        System.out.println(UserFactory.getRandomUsers(10));
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getLbUserEmail(), validUser.email);
    }

    @Test
    public void test2() {
        System.out.println(EmailFactory.getRandomEmails(10));
        app.dashboard.btnClickCreateLetter();
        app.createLetter.sendEmail(validEmail);
        app.sendingLetter.sendingConfirmation();
        app.dashboard.btnClickNewEmail();
        Assert.assertEquals(app.newIncomingEmail.getLbEmailRecipient(), validEmail.emailRecipient);
    }
}
