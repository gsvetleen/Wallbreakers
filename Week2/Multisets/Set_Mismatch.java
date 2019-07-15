class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        int duplicate = 0;
        int miss = 0;
        for(int n : nums){
            if(num.contains(n)){
                duplicate = n;
                continue;
            }
            num.add(n);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!num.contains(i)){
                miss = i;
                break;
            }
        }
        return new int[] {duplicate, miss};
    }
}