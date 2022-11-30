
/*
*QUESTION - 

Given an array of integers, return theindices of the two numbers that add up to
a given target.


1. Verify the constraints
-- are all the numbers positive or there can be negative numbers - POSITIVE NUMBERS ONLY
-- are there duplicates in the array ? - NO
-- is there always going to be a solution for the inputs ? - NO
-- is an empty array or an array with a singular value a valid input ? - JUST RETURN NULL IF THERE IS NO SOLUTION
-- are there nmultiple solutions for the problem ? - NO

*/

import java.util.HashMap;
import java.util.*;

class TwoSums {
	
	/*
	MOST EFFECTIVE SOLUTION.
	-- A brute force solution can be used as well.
	*/
	public static int[] twoSums(int[] nums, int target){
		//return null if array has less than 2 values
		if(nums.length <= 1){
			return null;
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++){
			int numToFind = target - nums[i];
			if(map.containsKey(numToFind)){
				return new int[]{map.get(numToFind), i};
			}
			else{
				map.put(nums[i], i);
			}
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSums(new int[]{1,3,7,9,2}, 11)));
	}
}