
public class Sorting_array {

	public static void main(String[] args) {
int [] a = new int[6];
for (int i=0; i<a.length;i++) {
	a[i] = (int)(Math.random() *60);
	System.out.println(a[i]);
}

for (int i=0;i<a.length;i++) {
	for(int j=0;j<5;j++) {
		if (a[j]>a[j+1]) {
			int temp = a[j];
			a[j] = a[j+1];
			a[j+1] = temp;
		}	
	}
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);	
}
	}

}
