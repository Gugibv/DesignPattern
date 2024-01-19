package com.grey.designpattern.templatemethod.v2;

public class PushNotification extends NotificationTemplate {

    @Override
    protected void prepareNotification() {
        System.out.println("Preparing push notification...");
        // Additional push notification-specific preparation logic
    }

    @Override
    protected String createMessage() {
        // Generate push notification message
        return "This is a push notification.";
    }

    @Override
    protected void sendMessage(String message, String recipient) {
        System.out.println("Sending push notification to " + recipient + ": " + message);
        // Actual push notification sending code
    }

}