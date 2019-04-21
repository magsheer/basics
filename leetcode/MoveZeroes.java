/*
    Move Zeroes

    Given an array nums, write a function to move all 0's to the end of it 
    while maintaining the relative order of the non-zero elements.

*/

class MoveZeroes {
    public void moveIt(int[] nums) {
        
        int moveIdx = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]!=0) {
                nums[moveIdx++] = nums[i];
            }
        }
        
        for(int i = moveIdx; i < nums.length; i++){
            nums[i] = 0;
        }
        
        
        /*
            Need not come back to fix zeroes and hence more optimal 
        */
        
        /*        
        int idx = 0;
        
        for(int i =0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                idx++;
            }   
        }
        */
        */
        
    }
}