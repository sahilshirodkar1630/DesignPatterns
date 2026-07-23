package org.sahil.StructuralPatterns.DecoratorPattern.Solution;

abstract class PizzaDecorator implements Pizza{

    protected  Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() ;
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}
