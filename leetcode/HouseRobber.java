/*
    You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

    Given a list of non-negative integers representing the amount of money of each house,   determine the maximum amount of money you can rob tonight without alerting the police.
*/

class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        if(nums.length == 1)
            return nums[0];
        
        int[] vals = new int[nums.length];
        
        vals[0] = nums[0];
        vals[1] = Math.max(nums[0], nums[1]);
        
        //determine if skipping makes more profit or including the current house
        for(int i = 2; i < nums.length; i++) {
            vals[i] = Math.max(nums[i]+vals[i-2], vals[i-1]);
        }
        
        return vals[nums.length-1];
        
    }
}