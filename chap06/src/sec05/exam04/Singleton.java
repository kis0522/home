package sec05.exam04;

public class Singleton {
	private static Singleton SingLeton = new Singleton();
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return SingLeton;
	}
}