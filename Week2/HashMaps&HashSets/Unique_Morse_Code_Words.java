class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] rep = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> holder = new HashSet<>();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            for(char a : words[i].toCharArray()){
                temp.append(rep[a-'a']);
            }
            holder.add(String.valueOf(temp));
            temp.setLength(0);
        }
        return holder.size();
    }
}