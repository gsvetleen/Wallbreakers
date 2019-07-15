class Solution {
    public int[][] transpose(int[][] A) {
        int a1 = A.length;
        int a2 = A[0].length;
        int[][] res = new int[a2][a1];
        for(int i = 0; i < a2; i++){
            for(int j = 0; j < a1; j++)
                res[i][j] = A[j][i];   
        }
        return res;
    }
}