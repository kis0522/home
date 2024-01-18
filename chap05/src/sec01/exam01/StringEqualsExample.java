package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "오윤석";
		String strVar2 = "오윤석";

		if(strVar1 == strVar2)
			System.out.println("strVar1과 strVar2는 참조가 같음");	//객체가 같음
		else
			System.out.println("strVar1과 strVar2는 참조가 다름");
		
		if(strVar1.equals(strVar2))
			System.out.println("strVar1과 strVar2는 문자열이 같음");

		String strVar3 = new String("오윤석");		// new(새로운 객체)를 생성해서 strVar3과 4는 서로 참조가 다름
		String strVar4 = new String("오윤석");
		
		if(strVar3 == strVar4)
			System.out.println("strVar3과 strVar4는 참조가 같음");
		else
			System.out.println("strVar3과 strVar4는 참조가 다름");
		
		if(strVar3.equals(strVar4))
			System.out.println("strVar3과 strVar4는 문자열이 같음");
	}
}