package builder_design_pattern;

public class user {
	private String name ;
	private String surname ;
	private String email ;

	private int age ;
	private String address ;
	private String phoneNum ;
	@Override
	public String toString() {
		return "user [name=" + name + ", surname=" + surname + ", email=" + email + ", age=" + age + ", address="
				+ address + ", phoneNum=" + phoneNum + "]";
	}
	public user(userBuilder u) {
		super();
		this.name = u.name;
		this.surname = u.surname;
		this.email = u.email;
		this.age = u.age;
		this.address = u.address;
		this.phoneNum = u.phoneNum;
	}
	
	
	public static class userBuilder {
		private String name ;
		private String surname ;
		private String email ;

		private int age ;
		private String address ;
		private String phoneNum ;
		
		public userBuilder(String name, String surname, String email) {
			super();
			this.name = name;
			this.surname = surname;
			this.email = email;
			
		}
		
		public userBuilder setAge(int age) {
			this.age=age;
			return this;
		}
		
		public userBuilder setadress(String adrr) {
			this.address=adrr;
			return this;
		}
		
		public userBuilder setPhoneNum(String phnum) {
			this.phoneNum=phnum;
			return this;
		}
		public user build() 
		{
			return new user(this);
		}
		

		
	}
	

}
