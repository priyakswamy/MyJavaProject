
public class Array1 {

	public static void main(String[] args) {
int [] a = new int[10];

for(int i =0; i<a.length;i++) {
	a[i] = i;
}
int sum = 0;
for(int i = 0; i<a.length;i++) {
	sum+= a[i];
}
System.out.println(sum);
	}

}
