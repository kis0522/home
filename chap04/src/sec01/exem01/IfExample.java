package sec01.exem01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		if(score >= 90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		if(score < 90) 
			System.out.println("점수가 90점보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		//if문에 괄호{}를 사용하지 않으면 첫줄만 if문에 들어간다.
	}
}