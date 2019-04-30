
public class If_else {

	public static void main(String[] args) {
	int a,b,c;
	a = 200*76;
	b = 300*78;
	c = 440*65;
	
	int high;
			 
	 if ( a>b && a>c)  {
		 //high =a;
		 System.out.println(a);
		 System.out.println("a is highest");
		 	 }
		 else if ( b>c && b>a) {
		 	//high = b;
		 	System.out.println(b);
		 	System.out.println("b is highest");
		 }
		 	 else if(c>a && c>b) {
		 		 //high =c;
		 		 System.out.println(c);
		 System.out.println("c is highest");
		 }
		 	 else {
		 		 System.out.println("equal");
		 	 }
		 	 }
		// System.out.println(high);	
	}


