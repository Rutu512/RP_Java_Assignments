/*In an array 1-100 numbers are stored. However, one number is duplicate. How
will you find the duplicate number? */

import java.util.*;
public class DuplicateElement {

	public static Set<Integer> findDuplicates(int input[]) 
	{ 
		Set<Integer> duplicates = new HashSet<Integer>(); 
		for (int i = 0; i < input.length; i++) 
		{ 
			for (int j = 1; j < input.length; j++)
			{ 
				if (input[i] == input[j] && i != j) 
				{ 
					duplicates.add(input[i]); 
					break; 
				} 
			}
		} 
	return duplicates;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,32,34,35,36,37,38,39,40};
		Set<Integer> duplicates=findDuplicates(input);
		System.out.println("Original elements in array are : "+ Arrays.toString(input));

		System.out.println("Duplicate elements found in array are : " + duplicates);
		
	}

}
/*
Original elements in array are : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 32, 34, 35, 36, 37, 38, 39, 40]
Duplicate elements found in array are : [32]*/