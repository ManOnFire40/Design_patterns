package design_patterns;

public class singleton_pattern {
	private static singleton_pattern instance;
	private singleton_pattern() {}
	public static singleton_pattern Instance() 
	{
		if (singleton_pattern.instance== null) {
			
			singleton_pattern.instance=new singleton_pattern();
		}
		
		return singleton_pattern.instance;
	}

	
}
