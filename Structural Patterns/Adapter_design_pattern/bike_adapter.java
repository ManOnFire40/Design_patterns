package Adapter_design_pattern;

public class bike_adapter implements vechile{

	private bike b;
	
	public bike_adapter(bike b1) {
		b=b1;
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		b.badal();
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		b.breaks();
		
	}

	@Override
	public void beeb() {
		// TODO Auto-generated method stub
		b.bell();
		
	}
	

}
