class Solution {
    public int distributeCandies(int[] candies) {
        int n = candies.length/2;
        HashSet<Integer> values = new HashSet<>();
        for(int i = 0; i < candies.length; i++)
            values.add(candies[i]);
        
        if(values.size() >= n)
            return n;
        else 
            return values.size();
    }
}