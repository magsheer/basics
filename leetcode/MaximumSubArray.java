/*
	Maximum Subarray

	Given an integer array nums, find the contiguous subarray 
	(containing at least one number) which has the largest sum and return its sum.
*/
class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int prevMax = nums[0];
        int currentSum = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            
            //compare the current sum to the element and their sum
            if(nums[i]>currentSum+nums[i])
                currentSum = nums[i];
            else
                currentSum = currentSum + nums[i];
           
            //track the previous sum
            if(currentSum > prevMax)
                prevMax = currentSum;
            else
                prevMax = prevMax;
            
            // currentSum = Math.max(nums[i], currentSum + nums[i]);
            // prevMax = Math.max(currentSum, prevMax);
        }
        
        return prevMax;
    }
}