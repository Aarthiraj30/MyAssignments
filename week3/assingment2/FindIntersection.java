package week3.assingment2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = {3,2,11,4,6,7};
		
		int[] a2 = {1,2,8,4,9,7};
		
		List<Integer> lst1 = new ArrayList<Integer>();
		List<Integer> lst2 = new ArrayList<Integer>();
		for (Integer i : a1)
		{ 
			lst1.add(i);
			}
		for (Integer j : a2)
		{
			lst2.add(j);	
			
		}
		for (int i = 0; i < lst1.size(); i++) {
			for (int j = 0; j < lst2.size(); j++) {
				if(lst1.get(i).equals(lst2.get(j)))
					{
						System.out.println(lst1.get(i));
					}
			}
		}
		//declare loop iterator
		/*for (int i = 0; i < a1.length; i++) {
			
			for (int j = 0; j < a2.length; j++) {
				
				if(a1[i]==a2[i])
				{
					System.out.println(a1[i]);
					break;
				}
			}
			
		}
		*/
	}

}
