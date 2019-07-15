class Solution {
    public boolean isSubsequence(String s, String t) {
        Queue<Integer> positions = new LinkedList<>();
        if(s.length() == 0)
            return true;
        for(int i = 0; i < t.length(); i++){
            if(s.length() != 0 && t.charAt(i) == s.charAt(0))
                positions.offer(i);
        }
        Boolean found = true;
        while(!positions.isEmpty()){
            int index = positions.poll();
            found = true;
            for(char ss : s.toCharArray()){
                index = t.indexOf(ss,index);
                if(index == -1){
                    found = false;
                    break;
                } 
                index++;
            }
            if(found == true)
                return true;
        }
        
        return false;
    }
}