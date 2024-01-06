package Adapter_design_pattern;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vechile v= new car();
		vech(v);
		vechile b=new bike_adapter(new bike());
		vech(b);
	}

	public static void vech(vechile v) {
		v.accelerate();
		v.beeb();
		v.stop();
		System.out.println();
	}
}
