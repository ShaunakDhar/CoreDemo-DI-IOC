package com.shaunak.notification;

public class PopUpNotificationService implements NotificationService {
    @Override
    public void sendNotification(){
        System.out.println("Pop Up Sent");
    }
}
