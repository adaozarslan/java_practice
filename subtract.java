package quizes.quiz1;

/*
 * 
 * Author: Ada Ozarslan 
 * ID: 018479
 * Date: 10/21/2021
 * 
 * 
 */

public class subtract {
	
//Write a subtract class that reports the difference between 
//two given integers with information on which one is larger

	public static void main(String[] args) {

		// Ensures that the input array has the length of 2
		if (args.length == 2) {
			// gets numbers and stores in an array
			int[] nums = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				nums[i] = Integer.parseInt(args[i]);
			}

			// Second bigger
			if (nums[1] > nums[0]) {
				System.out.println("Second number is larger and the difference is " + (nums[1] - nums[0]));

				// First bigger
			} else if (nums[0] > nums[1]) {
				System.out.println("First number is larger and the difference is " + (nums[0] - nums[1]));
				// Both same
			} else {
				System.out.println("Both numbers are the same");

			}
			//if the entry is not 2 integers inform
		} else {
			System.out.println("Please provide two numbers.");
		}

	}

}
