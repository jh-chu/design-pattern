package chapter03;

public class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    String description = "제목 없음";

    // 재료 추가 여부
    private boolean milk = false;
    private boolean soy = false;
    private boolean mocha = false;
    private boolean whip = false;
    
    public boolean hasMilk() { return milk; }
    public boolean hasSoy() { return soy; }
    public boolean hasMocha() { return mocha; }
    public boolean hasWhip() { return whip; }
    

    // 각 재료의 비용
    private double milkCost = 0.10;
    private double soyCost = 0.15;
    private double mochaCost = 0.20;
    private double whipCost = 0.10;

    // 각 재료 추가
    public void addMilk() { this.milk = true; }
    public void addSoy() { this.soy = true; }
    public void addMocha() { this.mocha = true; }
    public void addWhip() { this.whip = true; }


    public void setSize(Size size) { this.size = size; }
    public Size getSize() { return size; }
    public String getDescription() {  return description; }

    // 사이즈에 따른 기본 음료 가격 조정
    public double getSizeAdjustedCost(double baseCost) {
        switch (size) {
            case TALL:
                return baseCost;
            case GRANDE:
                return baseCost + 0.20;
            case VENTI:
                return baseCost + 0.40;
            default:
                return baseCost;
        }
    }

    // 기본 비용 + 사이즈별 추가 비용 + 추가된 재료들의 비용 합산
    public double cost() {
        double condimentCost = 0.0;
        if (hasMilk()) condimentCost += milkCost;
        if (hasSoy()) condimentCost += soyCost;
        if (hasMocha()) condimentCost += mochaCost;
        if (hasWhip()) condimentCost += whipCost;
        return condimentCost;
    }
}
