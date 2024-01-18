package sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		//클래스 인스턴스객체명 = 새로운 인스턴스객체
		Calculator myCalcu = new Calculator();
		
		//정사각형 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형 넓이 구하기
		double result2 = myCalcu.areaRectangle(10,20);
		
		//결과 출력
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
	}
}