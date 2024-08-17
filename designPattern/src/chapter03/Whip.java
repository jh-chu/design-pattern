package chapter03;

import chapter03.Beverage.Size;

public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage) { this.beverage = beverage; }

	@Override
	public String getDescription() { return beverage.getDescription() + ", 휘핑"; }

	@Override
	public double cost() {
		return 0.10 + beverage.cost(); 
	}

}
