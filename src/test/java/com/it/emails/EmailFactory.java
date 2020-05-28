package com.it.emails;

import com.it.utils.QAUtils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmailFactory {
    private static ResourceBundle email = ResourceBundle.getBundle("email");

    public static Email getValidEmail() {
        return new Email(email.getString("emailRecipient"),
                email.getString("emailSubject"),
                email.getString("emailBody"));
    }

    public static List<Email> getRandomEmails(int count) {
        return Stream.generate(
                () -> new Email(
                        QAUtils.getRandomString(10) + "@gmail.com",
                        QAUtils.getRandomString(15),
                        QAUtils.getRandomString(20)
                )).limit(count)
                .collect(Collectors.toList());
    }
}
