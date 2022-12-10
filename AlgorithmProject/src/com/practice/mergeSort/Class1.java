package com.practice.mergeSort;

public class Class1 {
	
	public void mergeSort(int[] arr) {
		//lenth
		int size = arr.length;
		
		
		//base condition
		if(size<=1) {
			return;
		}
		
		//find midd
		int mid = size/2;
		
		//temp arr
		int[] L = new int[mid];
		int[] R = new int[size-mid];
		
		for(int i=0; i<L.length; i++) {
			L[i] = arr[i];
		}
		
		for(int j=0; j<R.length; j++) {
			R[j]= arr[mid+j];
		}
		
//		printArr(L);
//		printArr(R);
		
		mergeSort(L);
		mergeSort(R);
		
		merge(L, R, arr);
	}
	
	private void merge(int[] L, int[] R, int[] arr) {
		
		int nL = L.length;
		int nR = R.length;
		int i =0, j=0, k=0;
		//1 5 9
		//2 3 6 7
		while(i<nL && j<nR) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<nL) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j<nR) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void printArr(int arr[]) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Class1 obj = new Class1();
		int[] arr = {4,3,1,7,5,4};
		obj.mergeSort(arr);
		
		obj.printArr(arr);
	}

}
