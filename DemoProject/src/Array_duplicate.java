import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Array_duplicate {

	public void array()  {

	int a[] = { 3, 6, 6, 5, 8, 9 };
	int b[] = new int[7];
	for (int i=0;i<5;i++) {
		if (a[i]!=a[i+1]) {
			
			b[i] = a[i];
		}
			
			System.out.println(b[i]);
		}
	
	}
		/*int b[] = new int[4];
		for (int i =0;i<a.length;i++) {
			for(int j =0; j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
				
			}
		for (int i=0; i<a.length;i++) {	
System.out.println(a[i]);

		}
int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length;j++) {

				if (a[i] == a[j]) {
					count++;
					if (count !=0) {
						System.out.println(a[j]);
					}
				
				}
	}

			}
		}

			
		/*Set <Integer> hs = new HashSet<Integer>();

for (Integer i : a)
for(int i=0; i<a.length;i++)
	hs.add(a[i]);
	System.out.println(hs);*/

	



	public static void main(String[] args) {
		Array_duplicate arr = new Array_duplicate();
		arr.array();

	}

}