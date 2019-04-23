/*
    Reverse Integer

    Given a 32-bit signed integer, reverse digits of an integer. Assume 
    that your function returns 0 when the reversed integer overflows.
*/

class ReverseInteger {
    public int reverse(int x) {

        //Integer range is [2^31, 2^31 -1]
        if (x==0 || x==Integer.MIN_VALUE)
            return 0;
        
        int sign = 1;
        if(x<0) {
            sign = -1;
            x *= -1;
        }
                
        int reverseInteger = 0;
        
        while (x != 0) {
            //Check for overflow
            if (Integer.MAX_VALUE/10 < reverseInteger)
                return 0;
            reverseInteger = reverseInteger * 10 + (x % 10);
            x = x / 10;
        }
        
        return sign * reverseInteger;
    }
}