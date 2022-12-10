package com.practice.problem11;

public class Class1 {
	
    public static int findDuplicate1(int[] nums) {
        int arr[] = new int[nums.length];
        int ans =0;
        
        for(int i =0; i<nums.length; i++){
            int num = nums[i];
            arr[num] = arr[num] + 1;
        }
        
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i]>1) {
        		ans = i;
        	}
        }
        
        return ans;
    }
    
/*    public static int findDuplicate2(int[] nums) {
    	int ans = 0;
    	for(int i=0; i<nums.length; i++) {
    		int num = nums[i];
    		if(nums[num] < 0) {
    			ans = i;
    		}else {
    			nums[num] = -1 * num;
    		}
    		
    	}
    	
    	return ans;
    }*/
    
    public static void main(String[] args) {
    	int nums[] = {1,3,4,2,2};
		System.out.println(findDuplicate1(nums));
	}

}
