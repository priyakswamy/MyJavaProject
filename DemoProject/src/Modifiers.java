import java.lang.reflect.Array;

public class Modifiers {
	int[] a = { 6, 4, 38, 1, 7 };

	public int[] sortArray() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	public int[] printArray() {
		sortArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		return a;

	}

	public int[] copyArray() {
		sortArray();
		int[] b = new int[5];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.println(b[i]);

		}
		return b;
	}

	
	 public int[] incArray() {
		 printArray();
		 int [] c = new int [a.length +1];
for (int i=0;i<c.length-1;i++)
	c[i] = a[i];

			 System.out.println(c.length);
			 return c;
		 }
	 
	  
	 

	public static void main(String[] args) {
		Modifiers mod = new Modifiers();
		//mod.copyArray();
		//mod.sortArray();
		//mod.printArray();
		mod.incArray();
	}

}
