package sec02.exam07;

public class FloatDoubleExample {
	//Float 과 Double의 예
	//float = 4byte
	//double = 8byte
	public static void main(String[] args) {
		//실수값 저장
		//float var 1 = 3.14 		//컴파일 에러 (Type mismatch)
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;	//0.12345678 8에서 반올림됨
		double var5 = 0.1234567890123456789;	//0.1234567891234567 7에서 반올림됨

		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
		//e 사용하기
		double var6 = 3e6;	//3e6 = 3*10*10*10*10*10*10
		float var7 = 3e6F;
		double var8 = 2e-3;	//2e-3 = 2/10/10/10
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
	}
}