package sec01.exam07.pack2;
import sec01.exam07.pack1.A;

public class D extends A{
	public D() {
		super();
		this.field = "value";
		this.method();
	}
	//다른 패키지에서 protected를 쓰려면 부모를 불러야 쓸 수 있음
}