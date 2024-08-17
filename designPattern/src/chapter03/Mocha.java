package chapter03;

import chapter03.Beverage.Size;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) { this.beverage = beverage; }

	@Override
	public String getDescription() { return beverage.getDescription() + ", 모카"; }

	@Override
	public double cost() {
		return 0.20 + beverage.cost(); 
	}

}
