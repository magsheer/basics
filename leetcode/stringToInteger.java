/*
    Implement atoi which converts a string to an integer.

    *can include character - return until the characters are numbers
    *can include whitespaces - trim it
    *can inclue a sign 
    *has to handle integer overflow

*/
class stringToInteger {
    public int myAtoi(String str) {
       
        //empty string
        String atoiStr= str.trim();
         if(atoiStr.length()==0)
            return 0;

        //sign
        int sign = 1;
        int i = 0;
        if(atoiStr.charAt(0) == '+') 
            i=1;
        
        if(atoiStr.charAt(0) == '-') {
            sign = -1;
            i=1;
        }
        
        long result = 0; //declared long type to check for int overflow

        //including the digit check in the while loop helped improve time complexity greatly
        while(i < atoiStr.length() && (0 <= atoiStr.charAt(i)-'0') && (atoiStr.charAt(i)-'0' <= 9)) {
            
            result = result * 10 + atoiStr.charAt(i) - '0';
            
            if((sign == 1) && (result > Integer.MAX_VALUE))
                return Integer.MAX_VALUE;
            
            if((sign == -1) && ((result * -1) < Integer.MIN_VALUE))
                return Integer.MIN_VALUE;
            i++;
        }

		return (int)result * sign;
    }
}