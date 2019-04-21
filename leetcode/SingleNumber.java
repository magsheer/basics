/*
    
*/

class SingleNumber {
    public int getSingleNumber(int[] nums) {
        
        // O(1) space complexity 

        int ret = 0;
        
        for(int n:nums) {
            ret = ret ^ n;
        }        
        
        return ret;
        
        
       
        /*
            Use a hashMap to keep the occurence count of the numbers
            Return the key with value = 1
        */
        
        /*
        HashMap<Integer, Integer> set = new HashMap<>();
        
        for(int i = 0; i< nums.length; i++){
            if(set.containsKey(nums[i]))
                set.put(nums[i], set.get(nums[i])+1);
            else
                set.put(nums[i],1);
            
        }
        for ( Map.Entry<Integer,Integer> entry : set.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
        */
    }
}