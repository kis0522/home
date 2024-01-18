package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();	//부모클래스
		Bus bus = new Bus();				//자식클래스
		Taxi taxi = new Taxi();				//자식클래스

		driver.drive(vehicle);				//부모 클래스 실행				Vehicle vehicle = Vehicle vehicle		vehicle.run()
		driver.drive(bus);					//자식 클래스 실행(자동형변환)		Vehicle vehicle = Bus bus				bus.run()
		driver.drive(taxi);					//자식 클래스 실행(자동형변환)		Vehicle vehicle = Taxi taxi				taxi.run()
	}
}