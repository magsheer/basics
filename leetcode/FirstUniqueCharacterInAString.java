/*
    First Unique Character in a String

    Given a string, find the first non-repeating character in it 
    and return it's index. If it doesn't exist, return -1.
*/
class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> charCount= new HashMap<Character,Integer>();
        
        for(int i=0; i<s.length(); i++) {
            if(charCount.containsKey(s.charAt(i))) 
                charCount.put(s.charAt(i),charCount.get(s.charAt(i))+1);
            else
                charCount.put(s.charAt(i),1);
        }
        
        for(int i=0; i<s.length(); i++) {
            if(charCount.get(s.charAt(i))==1)
                return i;
        }
        
        return -1;
        
    }
}