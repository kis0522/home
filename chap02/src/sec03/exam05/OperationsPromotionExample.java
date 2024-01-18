package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;	//컴파일 에러 ,cpu가 +연산을 32bit 부터 계산함
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;	//컴파일 에러 ,cpu가 +연산을 32bit 부터 계산함
		int intValue2 = charValue1 + charValue2;		//자동형변환
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);	//int -> char 강제형변환
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;					//강제형변환 float -> int 그래서 소수점이 잘림
		System.out.println(intValue4);

		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; 	//컴파일 에러
		double doubleValue = intValue5 / 4.0;			//강제형변환 float -> double
		System.out.println(doubleValue);

		int x = 1;
		int y = 2;
		double result = (double) x/y;					//double 형변환하지않음
		System.out.println(result);
	}
}