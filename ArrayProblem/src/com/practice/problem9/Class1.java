package com.practice.problem9;
/*
 *Problem: Minimise the maximum difference between heights 
 *
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K

Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.


Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.
Example 2:

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
Explanation:
The array can be modified as
{6, 12, 9, 13, 17}. The difference between 
the largest and the smallest is 17-6 = 11. 

Your Task:
You don't need to read input or print anything. Your task is to complete the function getMinDiff() which takes the arr[], n, and k as input parameters and returns an integer denoting the minimum difference.


Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N)
 *
 **/

import java.util.Arrays;

public class Class1 {
	
	public static int getMinDiff1(int[] arr, int n, int k) {
		
		int min = arr[0];
		int max = arr[0];
		int diff = max - min ;
		
		for(int i=0; i<n; i++) {
			
			if(arr[i]<min) {
				min = arr[i];
			}
			
			if(arr[i] > max ) {
				max = arr[i];
				
			}
			
			diff = max - min;
		}
		
    return diff - 2 * k;    
    }
	
	public int getMinDiff2(int arr[], int n, int k) {
		//{1, 5, 8, 10}
		//base case
		if(n==1 || arr.length <=1) {
			return 0;
		}
		
		Arrays.sort(arr);
		
		int ans= arr[n-1] - arr[0];
		
		for(int i=1; i<n; i++) {
			
			//negative not allowed
			if(arr[i]-k < 0) {
				continue;
			}
			
			int max = Math.max(arr[n-1]-k, arr[i-1] + k);
			int min = Math.min(arr[0] + k, arr[i] - k);
			
			ans = Math.min(max - min, ans);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Class1 class1 = new Class1();
		int arr[] = {1, 5, 8, 10};
		int ans = class1.getMinDiff2(arr, 4, 2);
		System.out.println(ans);
	}

}






