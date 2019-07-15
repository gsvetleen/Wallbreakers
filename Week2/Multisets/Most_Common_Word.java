class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder addString = new StringBuilder();
        Map<String,Integer> wordList = new HashMap<String,Integer>();
        List<Character> Ignore = Arrays.asList(' ','!','?','\'',',',';','.');
        for(int i = 0; i < paragraph.length();i++){
            if(Ignore.contains(paragraph.charAt(i))){
                if(Arrays.asList(banned).contains(String.valueOf(addString).toLowerCase())){
                    addString.setLength(0);
                    continue;
                }
                wordList.put(String.valueOf(addString).toLowerCase(),
                             wordList.getOrDefault(String.valueOf(addString).toLowerCase(),0)+1);   
                addString.setLength(0);
                continue;
            }
            addString.append(paragraph.charAt(i));         
        }
        if(!(String.valueOf(addString).toLowerCase().isEmpty())){
            if(!(Arrays.asList(banned).contains(String.valueOf(addString).toLowerCase())))
                 wordList.put(String.valueOf(addString).toLowerCase(),
                           wordList.getOrDefault(String.valueOf(addString).toLowerCase(),0)+1); 
        }
        String maxValue = " ";
        int max = 0;
        for(Map.Entry<String,Integer> entry : wordList.entrySet() ){
            if(entry.getValue() > max && !(entry.getKey().isEmpty())){
                max = entry.getValue();
                maxValue = entry.getKey();
            }
                
        }
        return maxValue;
    }
}