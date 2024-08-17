package chapter03;

public class Espresso extends Beverage {
	
	public Espresso() { description = "에스프레소"; }
	
	@Override
    public double cost() {
        double baseCost = 1.99; // 에스프레소의 기본 가격
        return getSizeAdjustedCost(baseCost) + super.cost(); // 사이즈에 따른 기본 가격 반영
    }
}
