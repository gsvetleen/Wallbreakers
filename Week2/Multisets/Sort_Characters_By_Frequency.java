class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();
        TreeMap<Integer, List<Character>> sort = new TreeMap<>(Collections.reverseOrder());
        for(char t : s.toCharArray())
            counter.put(t,counter.getOrDefault(t,0)+1);
        
        for(Map.Entry<Character,Integer> entry : counter.entrySet()){
            if(!sort.containsKey(entry.getValue())){
                List<Character> temp = new ArrayList<>();
                for(int i = 0; i < entry.getValue(); i++)
                    temp.add(entry.getKey());
                sort.put(entry.getValue(),temp);
            }else{
                List<Character> temp2 = sort.get(entry.getValue());
                for(int i = 0; i < entry.getValue(); i++)
                    temp2.add(entry.getKey());
                sort.put(entry.getValue(),temp2);
            }
            
        }
        StringBuilder result = new StringBuilder();
        System.out.println(sort);
        for(Map.Entry<Integer,List<Character>> entry : sort.entrySet()){
            int num = entry.getKey();
            List<Character> set = entry.getValue();
            for(char r : set)
                result.append(r);
        }
        return result.toString();
            
    }
}