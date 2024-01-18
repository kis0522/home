package sec01.exam03;

public class VariableUseExample {
	//VariableUseExample = 변수 사용 예
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + "	y : " + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("\ntemp를 통해 변경하면\nx : " + x + "	y : " + y + "	temp : " + temp);
	}
}
