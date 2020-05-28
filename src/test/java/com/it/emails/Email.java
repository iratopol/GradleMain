package com.it.emails;

public class Email {
    public String emailRecipient;
    public String emailSubject;
    public String emailBody;

    public Email(String emailRecipient, String emailSubject, String emailBody) {
        this.emailRecipient = emailRecipient;
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (emailRecipient != null ? !emailRecipient.equals(email.emailRecipient) : email.emailRecipient != null)
            return false;
        if (emailSubject != null ? !emailSubject.equals(email.emailSubject) : email.emailSubject != null) return false;
        return emailBody != null ? emailBody.equals(email.emailBody) : email.emailBody == null;
    }

    @Override
    public int hashCode() {
        int result = emailRecipient != null ? emailRecipient.hashCode() : 0;
        result = 31 * result + (emailSubject != null ? emailSubject.hashCode() : 0);
        result = 31 * result + (emailBody != null ? emailBody.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailRecipient='" + emailRecipient + '\'' +
                ", emailSubject='" + emailSubject + '\'' +
                ", emailBody='" + emailBody + '\'' +
                '}' + "\n";
    }
}
