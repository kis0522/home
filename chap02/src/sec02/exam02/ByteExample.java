package sec02.exam02;

public class ByteExample {
	//ByteExample = 바이트 예
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte var6 = 128;
		// byte = -128~127까지 취급한다. 1000.0000 -> -128, 0111.1111 -> 127
		// 1111.1111 -> -1이기 때문에 1000.0000 -> -128이다.
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}
