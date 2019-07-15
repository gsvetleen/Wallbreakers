class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        HashSet<Character> jewel = new HashSet<>();
        for(char a : J.toCharArray()){
            jewel.add(a);
        }
        for(char a : S.toCharArray()){
            if(jewel.contains(a))
                count++;
        }
        return count;
    }
}