package chapter03;

public abstract class CondimentDecorator extends Beverage {

	public Beverage beverage;
	public abstract String getDescription();
	
	@Override
	public Size getSize() { return beverage.getSize(); }
	

}
