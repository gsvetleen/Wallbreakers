// Does not pass all tests
//  291/304 test cases passed



class Solution {
    public double myPow(double x, int n) {
        double[] holder = new double[Math.abs(n)];
        if(n > 0)
            return recursive(x, n, holder);
        else
            return (1/recursive(x, n * -1, holder));
        
    }
    public double recursive(double x,int n, double[] holder){
        if(n == 0)
            return 1;
        else if(holder[n-1] == 0)
            holder[n-1] = x * recursive(x,n-1, holder);
        
        return holder[n-1];
    }
}