package observer;

public class student implements observer {
	private String name;

	public student(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.name+" has new notification "+message);
		
	}



}
