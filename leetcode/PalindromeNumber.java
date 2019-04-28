/*
    Palindrome Number

    Determine whether an integer is a palindrome. An integer is a palindrome
    when it reads the same backward as forward.
*/
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        
        if(x < 0)
            return false;
        
        int y = x;
        int z = 0;
        
        while(y!=0) {
            z = 10 * z + (y % 10);
            y = y / 10;
        }
        
        return x == z;
        
    }
}