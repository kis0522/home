package test.test02;

public class Exercise02 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils/students;
		System.out.println("학생 수 만큼 나눌 수 있는 펜의 갯수는 : " + pencilsPerStudent);
		
		int pencilsLeft = pencils%students;
		System.out.println("나눈 펜 중의 나머지 펜의 갯수는 : " + pencilsLeft);
	}
}