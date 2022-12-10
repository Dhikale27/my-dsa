package com.practice.problem13;

public class Class1 {
	
    static int maxSubarraySum(int arr[]){
    	//{1,2,3,-2,5,7}
    	if(arr.length==1) {
    		return arr[0];
    	}
    	
        int maxSum = 0;
        int currSum = 0;
        
        for(int i = 0; i<arr.length; i++) {
        	
        	currSum = currSum + arr[i];
        	
        	if(maxSum<currSum) {
        		maxSum = currSum;
        	}
        	
        	
        	if(currSum<0) {
        		currSum =0;
        	}
        	
        	
//        	if(arr[i]>=0) {
//        		currSum = currSum + arr[i];
//        	}else {
//        		if(maxSum<currSum) {
//        			maxSum = currSum;
//        		}
//        		currSum=0;
//        	}
//        	
//        	if(i == arr.length-1) {
//        		if(maxSum<currSum) {
//        			maxSum = currSum;
//        		}
//        	}
        }
        
        return maxSum;
        
    }
    
    public static void main(String[] args) {
    	int arr[] = {1,2,3,-2,5};
    	System.out.println(maxSubarraySum(arr));
	}
}
