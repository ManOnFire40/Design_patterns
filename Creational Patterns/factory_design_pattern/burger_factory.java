package design_patterns;

public class burger_factory {
	private static final int chicken_id=0; 
	private static final int cheese_id=1;
	
	public static burger create_burger(int  Bid) {
		if (Bid==0) {
			return new chicken_burger();
		}
		else {
			return new cheese_burger();
		}
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		burger b= burger_factory.create_burger(0);
		burger b1= burger_factory.create_burger(1);
		b.prepare();
		b1.prepare();
		
		

	}

}
