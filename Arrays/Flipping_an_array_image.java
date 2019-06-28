/*
Svetleen Guerrier

Time Taken: 40 min.
*/
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if(A.length == 0)
            return A;
        for(int i = 0; i < A.length; i++)
            reverse(A,i);
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
               A[i][j] = A[i][j] == 0 ?  1 :0;
            }
        }
        return A;
    }
    public void reverse(int[][] a, int i){
        int start = 0;
        int end = a[i].length-1;
        while(start < end){
            int temp = a[i][start];
            a[i][start] = a[i][end];
            a[i][end] = temp;
            start++;
            end--;
        }
        
    }
} 