class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int count = p.length();
        char[] compare = p.toCharArray();
        Arrays.sort(compare);
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i <= s.length() - count; i++){
            String temper = s.substring(i,i+count);
            char[] temp = temper.toCharArray();
            Arrays.sort(temp);
            //System.out.println(temp);
            if(Arrays.equals(temp,compare))
                result.add(i);
        }
        return result;
    }
}