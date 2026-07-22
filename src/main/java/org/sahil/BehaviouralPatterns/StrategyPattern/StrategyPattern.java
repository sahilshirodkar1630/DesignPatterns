package org.sahil.BehaviouralPatterns.StrategyPattern;

interface PaymentStrategy{
    void processPayment();
}

class DebitCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making Payment via DebitCard.");
    }
}

class CreditCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making Payment via CreditCard.");
    }
}

class UPI implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making Payment via UPI.");
    }
}

class PaymentService{
    PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(){
        strategy.processPayment();
    }

}
public class StrategyPattern {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.pay();

        paymentService.setPaymentStrategy(new UPI());
        paymentService.pay();

    }


}
