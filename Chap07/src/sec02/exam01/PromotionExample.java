package sec02.exam01;

class A{}				//A한테 B,C(자식) D,E(자손)
class B extends A{}		//B는 A에게 상속 되어있다
class C extends A{}		//C는 A에게 상속 되어있다

class D extends B{}		//D는 B에게 상속 되어있다
class E extends C{}		//E는 C에게 상속 되어있다
//class 5개 만든거랑 동일(ABCDE)

public class PromotionExample {
	
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		

		B b1 = d;
		C c1 = e;
		
		/*B b2 = e; e는c에 상속 되어있다.
		C c2 = d;	d는b에 상속 되어있다.*/
	}
}