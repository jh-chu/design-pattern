package chapter03;

public class HouseBlend extends Beverage {
	
	public HouseBlend() { description = "하우스 블렌드"; }

    @Override
    public double cost() {
        double baseCost = 0.89;
        return getSizeAdjustedCost(baseCost) + super.cost(); // 사이즈에 따른 기본 가격 반영
    }
	
}
