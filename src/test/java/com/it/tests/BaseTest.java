package com.it.tests;

import com.it.App;
import com.it.emails.Email;
import com.it.emails.EmailFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected App app = new App();
    protected User validUser = UserFactory.getValidUser();

    protected Email validEmail = EmailFactory.getValidEmail();

    @BeforeSuite
    public void beforeSuite() {

    }

    @AfterSuite
    public void afterSuit() {
        app.common.appStop();
    }
}
