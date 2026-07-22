package org.sahil.BehaviouralPatterns.StrategyPattern;

class PaymentServiceIn{

    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("Credit Card")){
            System.out.println("Making payment via credit card");
        } else if (paymentMethod.equals("Debit Card")) {
            System.out.println("Making payment via debit card");
        }else{
            System.out.println("Unsupported Payment Method");
        }
    }
}


public class WithoutStrategyPattern {

    public static void main(String[] args) {
        PaymentServiceIn paymentService = new PaymentServiceIn();
        paymentService.processPayment("Debit Card");
        paymentService.processPayment("Credit Card");
    }
}
