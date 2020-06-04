package com.it.helpers;

import com.it.pages.AllureLogger;
import com.it.pages.LoginPage;
import com.it.users.User;
import io.qameta.allure.Allure;

public class LoginHelper extends LoginPage {

    public void login(String login, String password) {
        setInputLogin(login);
        setInputPassword(password);
        btnClickLogin();

    }

    public void login(User user) throws InterruptedException {
        log.info(String.format("Login user name - %s , password - %s .", user.userName, user.password));
        driver.scrollDown();
        Thread.sleep(2000);
        driver.scrollUp();
        login(user.userName, user.password);

    }
}
