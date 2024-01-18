package sec01.exam04;

public class VariableScopeExample {
	//VariableScopeExample = 변하기 쉬운 범위 예
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5;
		//v2 Scope는 {} 안에서 끝난다. 그래서 v3은 v2를 인식할 수 없다.
	}
}
