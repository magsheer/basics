/*
    Rotate Array

    Given an array, rotate the array to the right by k steps, 
    where k is non-negative.
*/

class RotateArray {
    public void rotate(int[] nums, int k) {
        
        /* 
            O(1) space complexity
        */
        
        k = k % nums.length;
        
        reverse(0,nums.length-1,nums);
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);
        
        
        /* 
            O(n) space complexity
        */
       
        /*
        if(nums.length == 1)
            return;
        
        int a[] = new int[nums.length];
        
        for(int i=0; i<k; i++) {
            a[i] = nums[i+k+1];
        }
         
        for(int i=0; i<k+1; i++) {
            a[i+k] = nums[i];
        }
        
        for(int i=0; i<nums.length; i++) {
             nums[i]=a[i];
        }
        */
    }
    
    public void reverse(int start, int end, int[] nums) {
        int j = end;
        
        for(int i =  start; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}