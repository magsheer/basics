class containsDuplicate {
    
    /* 
        Track number already seen using a hashSet
        Return false when you see the duplicate
    */
    
    public boolean getSolution(int[] nums) {
        /* 
        //    O(n) and better space complexity
        */
        if(nums.length == 0)
            return false;
            
        int min = nums[0];
        int max = nums[0];
        
        for(int n:nums) {
            if(n>max) 
                max = n;
            if(n<min)
                min = n;            
        }       
   
        boolean[] checkDuplicate = new boolean [max-min+1];
        
        for(int n:nums){
            if(checkDuplicate[n-min]==true)
                return true;
            checkDuplicate[n-min] = true;
        }
        
        return false;
        /*
        //O(n)        
        Set<Integer> checkDuplicate = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            if(checkDuplicate.contains(nums[i]))
                return true;
            checkDuplicate.add(nums[i]);
        }
        return false;
        */
        
        
        /* 
        //O(n^2)
        for(int i = 0 ;i < nums.length-1 ; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    return true;
            }
        }
              
        return false;
         */
    }
}