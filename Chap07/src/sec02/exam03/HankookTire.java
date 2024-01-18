package sec02.exam03;

public class HankookTire extends Tire{
	//필드
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotatoion;
		if(accumulatedRotatoion<maxRotation) {
			System.out.println(location + " HankookTire Tire 수명 : " + (maxRotation - accumulatedRotatoion) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire Tire 펑크***");
			return false;
		}
	}
	
}