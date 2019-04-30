
public class SuperImp {
	String color = "White";
	String task = "bark";

	public static void main(String[] args) {
		F a = new F();
		a.print();

	}
}

class F extends SuperImp {
	String color = "black";

	public void print() {
		//System.out.println(color);
		System.out.println(super.color);
	}

}
