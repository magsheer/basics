/*
    The count-and-say sequence is the sequence of integers with the
    first five terms as following:

    1.     1
    2.     11
    3.     21
    4.     1211
    5.     111221

    1 is read off as "one 1" or 11.
    11 is read off as "two 1s" or 21.
    21 is read off as "one 2, then one 1" or 1211.

    Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the
    count-and-say sequence.

    Note: Each term of the sequence of integers will be represented as a string.
*/

class CountAndSay {
    
    /*
        Initially used an array but we need only the previous value
        at each iteration
    */
    
    public String count(int n) {
        
        // String[] arr = new String[n];
        String str = "1";
        StringBuilder sb = new StringBuilder();
        
        if(n == 1)
            return str;
        
        // arr[0] = "1";
        int count = 0;
        char element = '\0';
        
        for(int j=1; j<n; j++) {
            // String str = arr[j-1];
            
            //count + element
            element = str.charAt(0);
            count = 0;
            
            for(int i=0; i<str.length(); i++) {
                
                if(element == str.charAt(i))
                    count++;

                else {
                    sb.append(Integer.toString(count)).append(element);
                    element = str.charAt(i);
                    count = 1;
                }
            }
            
            sb.append(Integer.toString(count));
            sb.append(element);
            
            str = sb.toString();
            if(j == n-1)
                return str;
            
            sb.setLength(0);
        }
        
        return "";
        
    }
}