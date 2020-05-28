package com.it.helpers;

import com.it.pages.SendingLetterPage;

public class SendingLetterHelper extends SendingLetterPage {

    public void sendingConfirmation() {
        getLbEmailSentSuccess();
        btnClickEmails();
    }
}
