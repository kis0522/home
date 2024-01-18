package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		/*Phone phone = new Phone(); (x)*/
		
		SmartPhone smartPhone = new SmartPhone("홍길동");		//추상클래스는 자식 클래스로부터 받을 수 있다.
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}
}