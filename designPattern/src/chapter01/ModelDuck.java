package chapter01;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void dispaly() {
		System.out.println("저는 모형 오리입니다.");
	}

}
