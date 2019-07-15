class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> holder = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++)
            holder.add(nums1[i]);
        for(int i = 0; i < nums2.length; i++){
            if(holder.contains(nums2[i]) && !temp.contains(nums2[i]))
                temp.add(nums2[i]);
        }
        int[] result = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++)
            result[i] = temp.get(i);
        
        return result;
        
    }
}