/*
 * Provide an array of n-1 integers in the range of 1 to n with no duplicates in list, 
 * One of the integers is missing in the list. Write a code to find the missing integer.
 * 
 * Examples:

Input : arr[] = [1, 2, 3, 5, 6, 7, 8]
Output : 4

Input : arr[] = [1, 2, 4, 5, 6, 7, 8, 9]
Output : 3

 */


/*
 * Time Complexity: O (N) -> Traverse the array
 * 
 * Space Complexity: O (1) -> No extra space is used
 * 
 * Did this code successfully run on leetcode: Couldn't find this problem on leetcode
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.competitivecoding1;

public class MissingInteger {
	
	public int missingNumber(int[] nums) {
		/***************** Approach 1 ********************/
		/*
		 * Time Complexity: O (N)
		 * 
		 * This approach works only for sorted array
		 * 
		 * In this approach, we traverse through the input array and check if element at every index is equal to index+1
		 * If that condition fails, we exit the for loop and return the missing number as index+1
		 */
		
		/*int missing = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != i+1) {
				missing = i+1;
				break;
			}
		}
		return missing;*/
		
		/***************** Approach 2 ********************/
		/*
		 * Time Complexity: O (N)
		 * 
		 * This approach works for both sorted and unsorted array
		 * 
		 * The length of array is n-1, means 1 number is missing, length should be n
		 * 
		 * In this approach, we first calculate the sum of N numbers (numbers ranging from 1 to n) -> actual sum of array of length N
		 * Then, traverse through the array and calculate the sum of given array elements
		 * 
		 * Subtract "sum of array elements(n-1)" from actual sum of N(n) numbers
		 * We will get the missing number
		 */
		int n = nums.length + 1;
		int total = n * (n+1)/2;
		int sum = 0;
		
		for(int num : nums) {
			sum += num;
		}
		
		return total - sum;	
		
	}
	
	// main method
	public static void main(String[] args) {
		MissingInteger ms = new MissingInteger();
		
		//int[] array = {1,2,3,5,6,7,8};
		//int[] array = {1, 2, 4, 5, 6, 7, 8, 9};
		//int[] array = {1, 2, 4, 6, 3, 7, 8};
		int[] array = {1, 2, 3, 5};
		
		int number = ms.missingNumber(array);
		System.out.println(number);
	}

}
