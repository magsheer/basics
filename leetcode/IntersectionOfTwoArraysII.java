/*
    Intersection of Two Arrays II

    Given two arrays, write a function to compute their intersection.
*/

class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> countMap1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> countMap2 = new HashMap<Integer, Integer>();
        
        List<Integer> ret = new ArrayList<Integer>();
        
        for(int n: nums1) {
            if(countMap1.containsKey(n))
                countMap1.put(n, countMap1.get(n)+1);
            else
                countMap1.put(n, 1);
        }
        
        for(int n: nums2) {
            if(countMap2.containsKey(n))
                countMap2.put(n, countMap2.get(n)+1);
            else
                countMap2.put(n, 1);
        }
        
        
        
        for(Map.Entry<Integer, Integer> entry: countMap1.entrySet()) {
            int n=0;
            
            if(countMap2.containsKey(entry.getKey())) {
                if(entry.getValue() <= countMap2.get(entry.getKey()))
                    n = entry.getValue();
                else
                    n = countMap2.get(entry.getKey());
            }
    
            for(int i=0; i<n; i++) 
                ret.add(entry.getKey());
        }
        
        int[] arr = new int[ret.size()];
        
        for(int k=0; k<arr.length; k++)
            arr[k] = ret.get(k);
        
        return arr;
        
        /*
            Involves pre-sorting
        */
       
        /*
        List<Integer> ret = new ArrayList<Integer>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0;
        int j = 0;
        
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]==nums2[j]){
                ret.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else {
                i++;
            }
        }
        
        
        int[] arr = new int[ret.size()];
        
        for(int k=0; k<arr.length; k++)
            arr[k] = ret.get(k);
        
        return arr;
        */
      
    }
}