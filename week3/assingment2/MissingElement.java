package week3.assingment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		
		List<Integer> lst1 = new ArrayList<Integer>();
		for (Integer i : arr) {lst1.add(i);
				
		}
		Collections.sort(lst1);
		System.out.println(lst1);
		for (int i = 0; i < lst1.size(); i++) {
			if(lst1.get(i)!=(i+1)) {
				System.out.println(("The missing Element is" + " " + (i+1)));
				break;
			}
		}
	}
}
 
		
	


/*

*/