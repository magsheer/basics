/*
    Remove Element

    Given an array nums and a value val, remove all instances of that value
    in-place and return the new length.

    Do not allocate extra space for another array, you must do this by modifying
    the input array in-place with O(1) extra memory.

    The order of elements can be changed. It doesn't matter what you leave beyond
    the new length.
*/
class RemoveElementFrom1DArray {
    
    /*
        The solution below uses two variables 
        
        It can also be done with using just one extra variable
        
    */
    public int removeElement(int[] nums, int val) {
        
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                count++;
            }
            if(nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[i-count];
                nums[i-count] = temp;
            }
        }
        
        return nums.length - count;
    }
}