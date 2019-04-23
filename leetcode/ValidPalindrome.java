/*
	Valid Palindrome

	Given a string, determine if it is a palindrome, considering only 
	alphanumeric characters and ignoring cases.

	Define empty string as valid palindrome.
*/

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.equals(""))
            return true;
        
        int i = 0, j = s.length()-1;
        
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
           
            if( Character.toUpperCase(s.charAt(i)) !=  Character.toUpperCase(s.charAt(j)))
                return false;
            i++;
            j--;
        }
        
        return true;
    }
}