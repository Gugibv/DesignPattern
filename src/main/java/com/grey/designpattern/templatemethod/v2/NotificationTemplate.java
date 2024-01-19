package com.grey.designpattern.templatemethod.v2;

public abstract class NotificationTemplate {

    final void sendNotification(String recipient) {
        prepareNotification();
        String message = createMessage();
        sendMessage(message, recipient);
    }

    protected abstract void prepareNotification();

    protected abstract String createMessage();

    protected abstract void sendMessage(String message, String recipient);

}