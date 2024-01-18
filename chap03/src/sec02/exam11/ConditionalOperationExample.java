package sec02.exam11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : 'D';
		System.out.println(score + "점은 " + grade + "등급입니다.");
		// f까지 복습
	}
}