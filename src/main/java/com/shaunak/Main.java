package com.shaunak;

import com.shaunak.notification.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Learning about dependency injection and inversion of control
    static void main() {
        NotificationService notification = new SmsService() ;
        OrderService order = new OrderService();
        order.setNotification(notification);
        order.placeOrder();

    }
}
