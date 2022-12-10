package com.practice.problem17;

public class Class1 {
	//brute-force approch
	public static int getMaxProfit(int arr[]) {
		//[7,1,5,3,6,4]
		int size = arr.length;
		int maxProfit = 0;
		for(int i=0; i<size-1; i++) {
			for(int j=i+1; j<size; j++) {
				if(maxProfit< arr[j] - arr[i]) {
					maxProfit = arr[j] - arr[i];
				}
			}
		}
		return maxProfit;
	}
	
	public static int getMaxProfit2(int arr[]) {
		int maxProfit = 0;
		int currProfit = 0;
		for(int i=0; i<arr.length-1; i++) {
			
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {7,6,4,3,1};
		System.out.println(getMaxProfit(arr));
	}

}
