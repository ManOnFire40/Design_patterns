package observer;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 =new student("mohamed");
		student s2 =new student("malik");
		student s3 =new student("ahmed");
		student s4 =new student("natasha");
		course java=new course("java");
		java.subscribe(s1);
		java.subscribe(s2);
		java.subscribe(s3);
		java.subscribe(s4);
		java.setAvailability(true);
		
		

	}

}
