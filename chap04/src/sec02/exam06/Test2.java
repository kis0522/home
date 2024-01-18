package sec02.exam06;

public class Test2 {

	public static void main(String[] args) {
		int total = 0;
		int i = 0;
		int fv = 15;
		while(i < 10) {
			i++;
			total += i;	//total = total + i
			System.out.print(i);
			if(i != 10) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + total);
		total = 0;
		
		for(i = 1; i <= fv; i++) {
			total += i;
			System.out.print(i);
			if(i != fv)
				System.out.print(" + ");
		}
		System.out.println(" = " + total);
	}
}