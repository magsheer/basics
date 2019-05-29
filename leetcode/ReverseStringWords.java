/*
	Reverse Words in a String
	Given an input string, reverse the string word by word.

	Input: "the sky is blue"
	Output: "blue is sky the"

*/

class ReverseStringWords {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        
        for(int i = words.length-1; i >= 0; i--)
            sb.append(words[i] + " ");
        
        return sb.toString().trim();
    }
}
