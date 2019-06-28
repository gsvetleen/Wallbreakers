class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder newString = new StringBuilder();
        Stack<Character> myStack = new Stack<Character>();
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(s.charAt(i)))
                myStack.push(s.charAt(i));
        }
        
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                newString.append(myStack.pop());
                continue;
            }
            newString.append(s.charAt(i));
        }
        
        return newString.toString();
    }
}