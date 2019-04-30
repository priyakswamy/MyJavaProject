
public class India {
	String city;
	String currency;

	India(String city, String currency) {
		this.city = city;
		this.currency = currency;
	}

	public void display() {
		// TODO Auto-generated constructor stub

		System.out.println(city + "," + currency);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		India obj = new India("Delhi", "Rupee");
		obj.display();
		
		Test t = new Test();
		t.displaySum();
		t.displayValues();
		Sum s = new Sum();
		s.setNum1(4);
		s.setNum2(5);
	    s.displaySum();
	}

}
