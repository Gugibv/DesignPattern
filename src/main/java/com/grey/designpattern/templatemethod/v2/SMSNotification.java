package com.grey.designpattern.templatemethod.v2;

public class SMSNotification extends NotificationTemplate {

    @Override
    protected void prepareNotification() {
        System.out.println("Preparing SMS notification...");
        // Additional SMS-specific preparation logic
    }

    @Override
    protected String createMessage() {
        // Generate SMS message
        return "This is an SMS notification.";
    }

    @Override
    protected void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
        // Actual SMS sending code
    }

}