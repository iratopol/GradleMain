package com.it.helpers;

import com.it.emails.Email;
import com.it.pages.CreateLetterPage;

public class CreateLetterHelper extends CreateLetterPage {

    public void sendEmail(String recipient, String subject, String body) {
        setInputRecipient(recipient);
        setInputLetterSubject(subject);
        setInputLetterBody(body);
        btnClickSend();
    }

    public void sendEmail(Email email) {
        sendEmail(email.emailRecipient, email.emailSubject, email.emailBody);
    }
}
