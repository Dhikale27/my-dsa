package com.practice.problem12;

public class Class1 {
	
	static void merge(int arr1[], int arr2[]) {
//		ar1[] = {1, 4, 9, 10, 15, 20};
//	    ar2[] = {2, 3, 8, 13}
		
		int arr1Size = arr1.length;
		int arr2Size = arr2.length;
		int i = 0;
		int j = 0;
		while(i<arr1Size) {
			if(arr1[i]>arr2[j]) {
				//swap numbers
				int temp = arr1[i];
				arr1[i]= arr2[j];
				arr2[j] = temp;
				
				//after swapping we have to sort arr2 
				int k=1;
				while(k < arr2Size && arr2[k] < arr2[k-1]) {
					int temp1 = arr2[k];
					arr2[k] = arr2[k-1];
					arr2[k-1] = temp1;
					k++;
				}
			}
			
			i++;
		}
		
		
	}
	
	public static void printArr(int arr[]) {
		
		for(int num : arr) {
			System.out.print(num + ", ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr1[] = {1, 4, 9, 10, 15, 20};
	    int arr2[] = {2, 3, 8, 13};
	    
	    merge(arr1, arr2);
	    
	    
	    printArr(arr1);
	    printArr(arr2);
	}
	
	

}
