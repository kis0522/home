package sec01.exem06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		System.out.println("[현재시간: " + time + "시]");

		switch(time) {
		case 8:
			System.out.println("출근 합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");		//break가 없어서 밑에 있는 것과 함께 출력
		default:
			System.out.println("외근을 나갑니다.");
		}
	}
}