class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int p1 = 0; p1 < nums.length-1; p1++){
            int p2 = p1+1;
            while(p2 < nums.length){
                if(nums[p1] + nums[p2] == target){
                    result[0] = p1;
                    result[1] = p2;
                    return result;
                }
                ++p2;
                    
            }
        }
        return result;
    }
}