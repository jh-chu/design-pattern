package chapter03;

import chapter03.Beverage.Size;

public class StarbuzzCoffee {
	public static void main(String args[]) {
		
//		패턴 A : 데코레이터 아님, 추가옵션이 하나만 적용됨, 토핑 같은거 2개 추가 등이 불가
		Beverage beverage = new Espresso();
        beverage.setSize(Size.TALL);  // 사이즈 설정
		beverage.addMocha();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2.setSize(Size.GRANDE);
		beverage2.addMocha();
		beverage2.addMocha();
		beverage2.addWhip();
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.VENTI);
		beverage3.addSoy();
		beverage3.addMocha();
		beverage3.addWhip();
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

//		데코레이션 패턴 : new 를 사용해 재료를 추가 중첩가능
		Beverage beverage4 = new Espresso();
		System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
 
		Beverage beverage5 = new DarkRoast();
		beverage5.setSize(Size.TALL);
		beverage5 = new Mocha(beverage5);
		beverage5 = new Mocha(beverage5);
		beverage5 = new Whip(beverage5);
		System.out.println(beverage5.getDescription() + " $" +  beverage5.cost());
 
		Beverage beverage6 = new HouseBlend();
		beverage6.setSize(Size.VENTI);
		beverage6 = new Soy(beverage6);
		beverage6 = new Mocha(beverage6);
		beverage6 = new Whip(beverage6);
		System.out.println(beverage6.getDescription() + " $" + beverage6.cost());
		
	}
}
