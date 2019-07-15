class Solution {
    public boolean isPowerOfTwo(int n) {
        Double checkvalue = Double.valueOf(n);
        if(divide(checkvalue) == 1){
            return true;
        }
        
        return false;
    }
    
    public Double divide(Double n){
        
        if(n <= 1)
            return n;
        else if(!(n % 2 ==0))
            return n; 
        else
            return divide(n/2);
    }
}