class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();
        for(char letter : s.toCharArray()){
            s1.put(letter, s1.getOrDefault(letter,0)+1);
        }
        for(char letter : t.toCharArray()){
            s2.put(letter, s2.getOrDefault(letter,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : s1.entrySet()){
            if(entry.getValue().equals(s2.get(entry.getKey()))){
                // System.out.println("s1: value "+entry.getValue()+"  key: "+entry.getKey());
                // System.out.println("s2: value "+s2.get(entry.getKey()));
                continue;
            }else
                return false;
                
        }
        return true;
    }
}