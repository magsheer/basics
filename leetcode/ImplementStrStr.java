/*
    Implement strStr().

    Return the index of the first occurrence of needle in haystack,
    or -1 if needle is not part of haystack.

    Example:

    Input: haystack = "hello", needle = "ll"
    Output: 2

*/

class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        
        if(needle.equals(""))
            return 0;
        
        if(haystack.equals(""))
            return -1;
        
        if(haystack.equals(needle))
            return 0;
        
        if(needle.length()>haystack.length())
            return -1;
        
        int i = 0;
        int j = 0;
        int count  = 0;
        int idx = 0;
        
        //remember to check cases where the substring is in the end
        while(idx<=haystack.length()-needle.length()) {
            i = idx;
            j = 0;
            count = 0;
            while((haystack.charAt(i) == needle.charAt(j))&&(j<needle.length())&&(i<haystack.length())) {
                j++;
                i++;
                count++;
                if(count == needle.length())
                    return idx;
            }    
            idx++;
        }
        return -1;
    }
}