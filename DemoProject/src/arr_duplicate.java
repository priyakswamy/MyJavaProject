import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class arr_duplicate {
	public void array()  {

		//int a[] = { 3, 6, 6, 5, 8, 9 };
		ArrayList <Integer> a = new ArrayList<Integer>();
		//int a [] = new int[6];
		for(int i=1;i<6;i++) {
		//a[i] = i;	
			a.add(i);		

		}
		for(int i=1;i<4;i++) {
			a.add(i);

		}
		
		System.out.println(a);
		Set <Integer> hs = new HashSet<Integer>();
		//for(int i=0; i<a.size();i++)
		for(Integer i:a)
			hs.add(i);
			System.out.println(hs);
	}

	public static void main(String[] args) {
arr_duplicate ad = new arr_duplicate();
ad.array();
	}

}
