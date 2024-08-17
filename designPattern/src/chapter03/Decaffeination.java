package chapter03;

public class Decaffeination extends Beverage {
	
	public Decaffeination() { description = "디카페인"; }

    @Override
    public double cost() {
        double baseCost = 1.05;
        return getSizeAdjustedCost(baseCost) + super.cost(); // 사이즈에 따른 기본 가격 반영
    }
	
}
