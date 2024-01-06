package design_patterns;

public class burger {
	private String name;
	private int kcal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	public void prepare() {
		System.out.println(name +" has " +kcal+" kcal");
	}

	
}
