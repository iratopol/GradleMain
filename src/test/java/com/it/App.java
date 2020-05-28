package com.it;

import com.it.helpers.*;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashBoardHelper dashboard;
    public CreateLetterHelper createLetter;
    public SendingLetterHelper sendingLetter;
    public NewIncomingEmailHelper newIncomingEmail;

    public App() {
        common = new CommonHelper();
        login = new LoginHelper();
        dashboard = new DashBoardHelper();
        createLetter = new CreateLetterHelper();
        sendingLetter = new SendingLetterHelper();
        newIncomingEmail = new NewIncomingEmailHelper();
    }
}
