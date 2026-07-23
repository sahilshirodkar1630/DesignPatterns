package org.sahil.StructuralPatterns.AdapterPattern;

public class Client {

    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("sahil@gmail.com","Order Confirmation", " jdbfjhafjkfkjSf");

        NotificationService sendGridEmailService = new SendGridAdapter(new SendGridService());

        sendGridEmailService.send("sahil@gmail.com","Order Confirmation", " jdbfjhafjkfkjSf");

    }
}
