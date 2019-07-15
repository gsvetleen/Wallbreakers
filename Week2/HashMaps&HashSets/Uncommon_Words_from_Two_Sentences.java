class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> holder = new HashMap<>();
        for(String a : A.split("\\s+"))
            holder.put(a, holder.getOrDefault(a, 0)+1);
        for(String b : B.split("\\s+"))
            holder.put(b, holder.getOrDefault(b, 0)+1);
        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : holder.entrySet()){
            if(entry.getValue() == 1)
                result.add(entry.getKey());
        }
        return result.toArray(new String[0]);
    }
}