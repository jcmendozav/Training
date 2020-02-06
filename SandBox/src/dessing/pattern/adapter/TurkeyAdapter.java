package dessing.pattern.adapter;

public class TurkeyAdapter implements Duck {

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		// TODO Auto-generated constructor stub
		this.turkey=turkey;
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly from adapter");
		turkey.fly();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("quack from adapter");

		turkey.gobble();
	}

}
