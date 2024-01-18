package sec02.exam07;

public class ArrayReference0bjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);				//참조를 비교
		System.out.println(strArray[0] .equals (strArray[2]));		//문자만 비교
		
		System.out.println();
		
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		System.out.println(strArray[2]);
	}
}