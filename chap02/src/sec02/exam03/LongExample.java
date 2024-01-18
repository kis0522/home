package sec02.exam03;

public class LongExample {
	//LongExample = Long(길다) 타입 예
	public static void main(String[] args) {
		long var1 = 10;					//타입 변화 때문에 10이 출력된다. 하지만 보통 long타입에는 L을 붙인다.
		long var2 = 20L;
		long var3 = 2147483647;
		long var4 = -2147483648;
		//long var5 = 2147483648; -> 2147483647 까지가 범위이다. 32bit = 4byte = 256*256*256*256 = 4294967296
		//4294967296/2 = 2147483648 -2147483648~2147483647
		long var6 = 1000000000000000L;
		//long var7 = 1000000000000000; -> L을 붙이지 않아 2147483647 이후부터는 출력을 할 수 없다.

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var6);
	}
}
