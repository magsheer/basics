/*
    Valid Anagram

    Given two strings s and t , write a function to determine if t is an anagram of s.
*/

class Anagram {
    public boolean isAnagram(String s, String t) {
        
        
        if(s.length() != t.length()) 
            return false;
        
        int[] counter = new int[26];
        
        for(char c : s.toCharArray()) 
            counter[c-'a'] +=1;
        
        for(char c : t.toCharArray()) 
            counter[c-'a'] -=1;
        
        for(int i: counter) {
            if(i!=0)
                return false;
        }
        
        
        return true;
        
        
            
        /* 
            Using Hashmap
            
        */
        
        /*
        if(s.length() != t.length()) 
            return false;
        
        HashMap<Character, Long> sMap = new HashMap<Character, Long>();
        
        for(char c : s.toCharArray()) {
            if(sMap.containsKey(c))
                sMap.put(c, sMap.get(c)+1);
            else
                sMap.put(c, Long.valueOf(1));
        }  
        
        for(char c : t.toCharArray()) {
            if(sMap.containsKey(c))
                sMap.put(c, sMap.get(c)-1);
            else
                return false;
        }
        
        for(char c : s.toCharArray()) {
            if(sMap.get(c)!=0)
                return false;
        }
        
        return true;
        */
        
    }
}