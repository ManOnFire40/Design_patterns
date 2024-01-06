package builder_design_pattern;

public class main {

	public static void main(String[] args) {

		user u =new user.userBuilder("mohamed", "ehab", "mo.ehab").build();
		user u1 =new user.userBuilder("mohamed", "ehab", "mo.ehab").setAge(21)
				.setPhoneNum("01096616978").setadress("cairo").build();
		
		System.out.println(u);
		System.out.println();
		System.out.println();
		System.out.println(u1);
		
		

	}

}
