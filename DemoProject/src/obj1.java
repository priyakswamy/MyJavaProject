public class obj1 {

	public static void main(String[] args) {
		obj1 o = new obj1();
		Plant pt = o.new Plant();
		pt.season = "automn";
		pt.type = "orange";
		System.out.println(pt.type + pt.year   + pt.season);
	}

	class Plant {
		String type;
		String season;
		int year = 20;

	}

}