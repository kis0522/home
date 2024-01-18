package sec03.exam06;

public class StringConcatExample {
	
	public static void main(String[] args) {
		//숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value : " + value);
		
		//결합 연산 (왼쪽 부터 계산함)
		String str1 = 10 + 2 + "8";				//"은 문자열이여서 "이게 왼쪽에 있으면 전부 문자열로 숫자가 왼쪽에 있으면 숫자부터 계산
		System.out.println("str1 : "+ str1);

		String str2 = 10 + "2" + 8;
		System.out.println("str2 : "+ str2);

		String str3 = "10" + 2 + 8;
		System.out.println("str3 : "+ str3);

		String str4 = "10" + (2 + 8);
		System.out.println("str4 : "+ str4);
	}
}