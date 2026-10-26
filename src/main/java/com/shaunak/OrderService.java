package com.shaunak;


import com.shaunak.notification.NotificationService;


public class OrderService {

    NotificationService notification;

    public OrderService(NotificationService notification){
        this.notification = notification;
    }
    //Empty Constructor - overloading
    public OrderService(){

    }

    public void placeOrder(){
        System.out.println("order placed");
        notification.sendNotification();
    }

    //setter
    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
