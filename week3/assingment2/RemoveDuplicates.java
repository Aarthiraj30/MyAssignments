package week3.assingment2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as a part of java sessions in java week";
		int count =0;
		
		String[] split1 = text.split(" ");
		for (int i = 0; i < split1.length; i++) {
			for (int j = i+1; j < split1.length; j++) {
				if(split1[i].equals(split1[j])) {
					split1[j] = "";
					count++;
								
				}
			}
			}
				if(count>1) {
					
					System.out.print(Arrays.toString(split1));
					
					}
				}
				
				
			
			
		

	}


