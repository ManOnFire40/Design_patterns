package Adapter_design_pattern;

public class car implements vechile{

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("car start moving");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("car stops");
	}

	@Override
	public void beeb() {
		// TODO Auto-generated method stub
		System.out.println("beeb beeb .....");
	}

}
