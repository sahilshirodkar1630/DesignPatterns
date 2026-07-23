package org.sahil.StructuralPatterns.DecoratorPattern.Solution;


public class DecoratorPattern {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();

        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

    }

}
