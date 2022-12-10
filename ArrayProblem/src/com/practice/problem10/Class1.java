package com.practice.problem10;

public class Class1 {
//	arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
//	Output: 3 
	static int minJumps(int[] arr){
        //base case
        int size = arr.length;
        if(size == 0){
            return 0;
        }
        
        if(size == 1){
            return 1;
        }
        
        int count = 0;
        int pos = 1;
        while(pos < size){
            count++;
            pos = pos + arr[pos - 1];//5
            if(count >= size) {
            	break;
            }
        }
        
        if(count<size) {
        	return count;
        }else {
        	return -1;
        }
        
        
    }
	
	static int minJumps2(int[] arr){
		
		int start = 1;
		int end = start + arr[0];
		int count = 1;
		
		while(end < arr.length) {
			int j=end-1;
			int maxPos = end + arr[end-1];
			int tempEnd = end;
			
			while(start < j) {
				int temp = arr[j-1] + j;
				if(maxPos< temp) {
					maxPos = temp;
					tempEnd = j;
				}
				j--;
			}
			
			start = tempEnd;
			end = maxPos;
			count++;
			
			if(count > arr.length) {
				break;
			}
			
		}
		if(count<arr.length) {
			return count;
		}else {
			return -1;
		}
	
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 4, 3, 2, 6, 7} ;
		
		System.out.println(minJumps2(arr));
		
	}
}
