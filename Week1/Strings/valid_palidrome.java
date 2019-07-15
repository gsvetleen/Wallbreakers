class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^a-zA-Z0-9]", "");
        newString = newString.toLowerCase();
        System.out.println(newString);
        char[] reverse = newString.toCharArray();
        for(int i = 0; i < newString.length(); i++){
            reverse[i] = newString.charAt(newString.length()-i-1);
        }
    
        return String.valueOf(reverse).equals(newString);
    }
}