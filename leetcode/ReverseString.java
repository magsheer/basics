/*
    Reverse String
    
    Write a function that reverses a string in-place. 
    The input string is given as an array of characters char[].

    Modify the input array in-place with O(1) extra memory.
*/
class ReverseString {
    public void reverse(char[] s) {
        
        if(s.length == 0)
            return;
            
        int i = 0;
        int j = s.length - 1;
        
        while(i<j){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }       
        
    }
}