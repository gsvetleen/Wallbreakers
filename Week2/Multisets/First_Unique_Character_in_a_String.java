class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==0)
            return -1;
        Map<Character,Integer> hashmap = new HashMap<Character,Integer>();
        for(Integer i = 0; i < s.length(); i++){
            hashmap.put(s.charAt(i), hashmap.getOrDefault(s.charAt(i),Integer.valueOf(0))+1);
        }
       for(int i = 0; i < s.length(); i++){
          if(hashmap.get(s.charAt(i)) == 1)
              return i;
       }
        
        return -1;
        
           
            
    }
}