package week3.assingment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7};
		
		List<Integer> lst = new ArrayList<Integer>();
		for (int j = 0; j < data.length; j++) {
			
			lst.add(data[j]);
			
		}
			Collections.sort(lst);
			System.out.println(lst);
			
			System.out.println("The largest largest Number is" + " " + lst.get(lst.size()-2));
			
			
		
	}
		
		/*
		 *int size = data.length;
		 * Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			
			System.out.println(data[i]);
			
		}
		
		int secLar = data[size-2];
		
		System.out.print("the second largest number is "+ " " + secLar);
		
		return;
		 */
		
}

