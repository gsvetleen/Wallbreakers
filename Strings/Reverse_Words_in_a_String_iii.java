class Solution {
    public String reverseWords(String s) {
        StringBuilder parser = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for(char word : s.toCharArray()){
            if(word == ' ' && parser.length() > 0){
                result.append(reverseWord(parser));
                result.append(' ');
                parser.setLength(0);
            }else
                parser.append(word);
                
        }
        result.append(reverseWord(parser));
        return result.toString();
    }
    
    public String reverseWord(StringBuilder parser){
        int left = 0;
        int right = parser.length() -1;
        while(left < right){
            char temp = parser.charAt(left);
            parser.setCharAt(left, parser.charAt(right));
            parser.setCharAt(right, temp);
            left++;
            right--;
        }
        return parser.toString();
    }
}