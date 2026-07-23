package org.sahil.StructuralPatterns.DecoratorPattern.Solution;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    public String getDescription(){
        return decoratedPizza.getDescription() + ",Cheese";
    }

    public double getCost() {
        return decoratedPizza.getCost() + 1.00; // base cost
    }


}
