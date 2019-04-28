/*
    Given a roman numeral, convert it to an integer. Input is guaranteed to be
    within the range from 1 to 3999.

    There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

    The solution's complexities can be improved by using a switch case to convert
    the values to numbers, storing it in an integer array and using the same logic.
*/
class RomanToInteger {
    public int romanToInt(String s) {
        
        HashMap<Character,Integer> valueMap = new HashMap<Character,Integer>();
        
        valueMap.put('I',1);
        valueMap.put('V',5);
        valueMap.put('X',10);
        valueMap.put('L',50);
        valueMap.put('C',100);
        valueMap.put('D',500);
        valueMap.put('M',1000);
        
        if(s.length() == 1)
            return valueMap.get(s.charAt(0));
        //check if now < next
        int result = 0;
        int i = 0;
        while(i<s.length()-1) {
            if(valueMap.get(s.charAt(i))<valueMap.get(s.charAt(i+1)))
                result -= valueMap.get(s.charAt(i));
            else
                result += valueMap.get(s.charAt(i));
            i++;
        }
        
        result += valueMap.get(s.charAt(i));
        
        return result;
    }
    
}