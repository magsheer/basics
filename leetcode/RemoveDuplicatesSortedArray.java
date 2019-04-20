/* 
    Remove Duplicates from Sorted Array
    
    Given a sorted array nums, remove the duplicates in-place
    such that each element appear only once and return the new length.

    Do not allocate extra space for another array, you must do this 
    by modifying the input array in-place with O(1) extra memory.  
    
*/

class RemoveDuplicatesSortedArray {
    
    /* 
        track the number of duplicates in the array move
        the next unique number to it's new position using 
        this duplicate count 
    */
    
    public int removeDuplicates(int[] nums) {
        
        int duplicateCount = 0;
        
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1])
                duplicateCount++;
            else
                nums[i+1-duplicateCount] = nums[i+1];
        }
        
        return nums.length - duplicateCount;
    }
}