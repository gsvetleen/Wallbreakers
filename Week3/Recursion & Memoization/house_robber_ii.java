class Solution {
    public int rob(int[] nums) {
      if(nums.length == 0)
          return 0;
      else if(nums.length == 1)
          return nums[0];
      int[] array1 = Arrays.copyOfRange(nums,0,nums.length-1);
      int[] array2 = Arrays.copyOfRange(nums,1,nums.length);
      int[] cache1 = new int[array1.length+1];
      int[] cache2 = new int[array2.length+1];
      Arrays.fill(cache1,-1);
      Arrays.fill(cache2,-1);
      return Math.max(findMax(cache1,0,array1),findMax(cache2,0,array2));
        
    }
    public int findMax(int[] cache, int count, int[] nums){
        if(count >= nums.length)
            return 0; 
        else if(cache[count] != -1)
            return cache[count];
        cache[count] = Math.max(nums[count] + findMax(cache,count+2,nums),findMax(cache,count+1,nums));
        return cache[count];
    }
}