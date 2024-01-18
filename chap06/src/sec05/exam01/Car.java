package sec05.exam01;

public class Car {
	//필드
	String model;
	int speed;
	
	//생성자 = class와 이름이 같은것
	Car(String model){
		this.model = model;
	}
	
	//메소드 int,double,void 같은 것이 필요함
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 50; i+= 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
		}
	}
}