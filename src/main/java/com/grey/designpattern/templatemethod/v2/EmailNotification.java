package com.grey.designpattern.templatemethod.v2;

public class EmailNotification extends NotificationTemplate {

    @Override
    protected void prepareNotification() {
        System.out.println("Preparing email notification...");
        // Additional email-specific preparation logic
    }

    @Override
    protected String createMessage() {
        // Generate email message
        return "This is an email notification.";
    }

    @Override
    protected void sendMessage(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
        // Actual email sending code
    }

}