package sec02.exam06;

public class EscapeExample {
	//EscapeExample = 예외문자 예
	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업"); // \t = 문자가 보일때 Tab키 누른 후 출력
		System.out.print("행 단위 출력\n"); // \n = 줄바꿈
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다."); // \" = "를 문자에 보이게 하는것
		System.out.println("봄\\여름\\가을\\겨울"); // \\ = \(백슬래시)를 문자에 보이게 하는것
	}
}
