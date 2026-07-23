package org.sahil.StructuralPatterns.DecoratorPattern.Solution;

public class OliveDecorator extends PizzaDecorator{

    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    public String getDescription(){
        return decoratedPizza.getDescription() + ", Olives";
    }

    public double getCost() {
        return decoratedPizza.getCost() + 1.00; // base cost
    }
}
