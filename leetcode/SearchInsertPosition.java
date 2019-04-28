/*
    Search Insert Position
    
    Given a sorted array and a target value, return the index if the target       is found. If not, return the index where it would be if it were inserted     in order.

    You may assume no duplicates in the array.

    hint: binary search
*/

 class searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        
        //much simpler solution
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target)
                return i;   
        }
        
        return nums.length;
        
        /*
        if(target > nums[nums.length-1])
            return nums.length;
        
        int index = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]==target)
                return i;
            if(target<nums[i]){
                if(index ==-1)
                    index = i;
                else if(i < index)
                    index = i;
            }
        }
        
        return index;
        */
    }
}