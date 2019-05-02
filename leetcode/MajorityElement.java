/*
    Given an array of size n, find the majority element. The majority element
    is the element that appears more than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always
    exist in the array.

    Example 1:
    Input: [3,2,3]
    Output: 3

    Another interesting way to solve it: Boyer-Moore Voting Algorithm
*/
class MajorityElement {
    public int getMajorityElement(int[] nums) {
        HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            if(numMap.containsKey(nums[i])) {
                int x = numMap.get(nums[i]);
                numMap.put(nums[i], ++x);
            }
            else
                numMap.put(nums[i], 1);
        }
        
        int count = 0;
        int ans = 0;
        
        for(Map.Entry<Integer,Integer> entry : numMap.entrySet()){
            if(entry.getValue()>=count){
                ans = entry.getKey();
                count = entry.getValue();
            }
        }
        
        return ans;
        
        // If there is a majority element it'll be at n/2th index
        // Arrays.sort(nums);
        // return nums[nums.length/2];
    }
}