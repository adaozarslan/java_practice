// This code gives the second minimum in a given sequence of integers.

public class secMin {
	/*
	 * 
	 * Author: Ada Ozarslan 
	 * Date: 10/16/2021
	 * Github:https://github.com/adaozarslan
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		if(args.length>=2) {
			
			//gets numbers and stores in an array of the same length
			int [] nums = new int [args.length];
			for (int i=0; i < args.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
		    }
			// call the method 
			secMin (nums);
		}
		else {
			System.out.println("Give more than two integers");
		}
		
		

}
	public static int secMin(int[]nums) {
		//define min
		int min = nums[0];
		//define minIndex
		int minIndex=0;
		
		//iterate nums 
		for (int i=0; i<nums.length; i++) {
			
			//if min > current	
			//min= current
			if(min > nums[i]) {
				min=nums[i];
				minIndex=i;
			}
		}
		
		//define s_min	
		int s_min = nums[0];
		
		
		//iterate nums
		for (int i=0; i<nums.length; i++) {
				//if nums[minIndex] pass
			if(i == minIndex) {
				continue;
				}
				//else if s_min > current
			    //second min = current
			 if (s_min > nums[i]) {
				s_min = nums [i];
	
			}
			
		
		}
		// report second min
		System.out.println("second min is " + s_min );
		
		return s_min;
		
	}
}
