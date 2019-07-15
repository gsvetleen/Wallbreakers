class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> values1 = new HashMap<>();
        
        char result = '\0';
        for(char a : s.toCharArray())
            values1.put(a, values1.getOrDefault(a,0)+1);
        
        for(char i : t.toCharArray())
            values1.put(i, values1.getOrDefault(i,0)+1);
        
        for(Map.Entry<Character, Integer> entry : values1.entrySet()){
            if(entry.getValue() % 2 == 1){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}