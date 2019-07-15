class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> holder = new HashSet<>();
        int sum = 0;
        while(sum != 1){
            sum = 0;
            while(n > 0){
                int temp = n % 10;
                sum += (temp * temp);
                n /= 10;
            }
            if(holder.contains(sum))
                return false;
            else
                holder.add(sum);
            System.out.println(sum);
            n = sum;
        }
        return true; 
    }
}