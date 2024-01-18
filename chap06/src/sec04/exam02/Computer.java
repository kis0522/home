package sec04.exam02;

public class Computer {
	int sum1(int[] values) {		//var = values  // 밑에거랑 같다
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {		//위에 것 보다 권장 사항
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}