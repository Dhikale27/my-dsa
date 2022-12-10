package com.practice.problem14;

public class Class1 {
	
	
	
    public static int[][] merge(int[][] arr) {
//    	Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    	//Output: [[1,6],[8,10],[15,18]]
    	
    	arr= sortArr(arr);
    	int notUse=0;
    	for(int i=0; i<arr.length-1; i++) {
    		if(arr[i][1] >= arr[i+1][0]) {
    			arr[i+1][0] = arr[i][0];
    			arr[i][0]= 0;
    			arr[i][1]=0;
    			notUse++;
    		}
    	}
    	
    	int ans[][] = new int[arr.length-notUse][2];
    	int j = 0;
    	for(int i =0; i<arr.length; i++) {
    		if(!(arr[i][0] == 0 && arr[i][1]==0)) {
    			ans[j] = arr[i];
    			j++;
    		}
    	}
    	
    	return ans;
    	
    }
    
    public static int[][] sortArr(int[][] arr) {
    	
    	for(int i=arr.length-1; i>=0; i--) {
    		for(int j=0; j<i; j++) {
    			if(arr[j][0]>arr[j+1][0]) {
    				int[] temp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = temp;
    			}
    		}
    	}
    	
    	return arr;
    }
    
    public static void printArr(int[][] arr) {
    	for(int a[] : arr) {
    		System.out.print("["+ a[0] + ","+ a[1]+ "], ");
    	}
    	System.out.println();
    }
    
    public static void main(String[] args) {
		int arr[][] = {{2,6},{1,3},{15,18},{8,10}};
		int[][] ans = merge(arr);
		
		printArr(ans);
		System.out.println();
	}
}
