package org.sahil.StructuralPatterns.DecoratorPattern.Problem;

public class CheeseOlivePizza extends CheezePizza{

        @Override
        public String getDescription() {
            return super.getDescription()+", Olives";
        }

        @Override
        public double getCost() {
            return super.getCost() + 0.50;
        }
}
