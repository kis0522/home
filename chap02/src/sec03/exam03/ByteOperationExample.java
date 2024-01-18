package sec03.exam03;

public class ByteOperationExample {
	//바이트 연산 예
	public static void main(String[] args) {
		//강제형변환 예제
		byte result1 = 10+20;			//10+20 은 자동으로 int를 사용
		System.out.println(result1);

		//자동형변환 예제
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
	}
}