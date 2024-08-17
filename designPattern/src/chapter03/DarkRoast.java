package chapter03;

public class DarkRoast extends Beverage {
	
	public DarkRoast() { description = "다크로스트"; }
	
    @Override
    public double cost() {
        double baseCost = 0.99;
        return getSizeAdjustedCost(baseCost) + super.cost(); // 사이즈에 따른 기본 가격 반영
    }

}
