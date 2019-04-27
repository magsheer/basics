/*
    Shuffle an Array

    Shuffle a set of numbers without duplicates.
*/

class ShuffleArray {
    
    int[] originalArray;

    public Solution(int[] nums) {
        originalArray = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return originalArray;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] ret = originalArray.clone();
        Random rand = new Random();
        
        for(int i = 0; i < ret.length; i++) {
            int r = rand.nextInt(ret.length);
            int temp = ret[i];
            ret[i] = ret[r];
            ret[r] = temp;
            
        }
        return ret;
    }
    
    /* Uses an ArrayList --- arrayList */
    
    /*ArrayList<Integer> originalArr = new ArrayList<Integer>();

    public Solution(int[] nums) {
        for(int i = 0; i < nums.length; i++) 
            originalArr.add(new Integer(nums[i]));
    }
    
    
    public int[] reset() {
        int[] resetArr = new int[originalArr.size()];
        
        for(int i = 0; i < originalArr.size(); i++) 
            resetArr[i] = originalArr.get(i);
        
        return resetArr;
    }
    
    
    public int[] shuffle() {
        int[] ret = new int[originalArr.size()];
        Random rand = new Random();
        
        for(int i = 0; i < originalArr.size(); i++) 
            ret[i] = originalArr.get(i);
        
        for(int i = 0; i < ret.length; i++) {
            int r = rand.nextInt(ret.length);
            int temp = ret[i];
            ret[i] = ret[r];
            ret[r] = temp;
            
        }
        return ret;
    }*/
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */