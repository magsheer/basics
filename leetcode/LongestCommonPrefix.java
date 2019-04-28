/*
    Longest Common Prefix

    Write a function to find the longest common prefix string amongst
    an array of strings.

    If there is no common prefix, return an empty string "".
*/
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==0)
            return "";
        
        String prefix = strs[0];
        
        int i = 1; 
        while(i < strs.length) {

            int len = 0;
            len = (prefix.length() < strs[i].length()) ? prefix.length() : strs[i].length();

            //prefix cannot be more than the length of the strings themselves
            prefix = prefix.substring(0,len); 
            
            int j = 0;
            for(j = 0; j < len; j++) {
                if(prefix.charAt(j)!=strs[i].charAt(j)){
                    prefix = prefix.substring(0, j);
                    break;
                }
            }

            i++;
        }
        
        return prefix;
        
    }
}