package org.sahil.StructuralPatterns.AdapterPattern;

public class SendGridService {
    public void sendEmail(String recipient, String title,String content){
        System.out.println("Sending Email to "+recipient);
        System.out.println("Title:  "+title);
        System.out.println("Content:  "+content);
    }
}
