/*

Svetleen Guerrier 

Time Taken: 23 min.
*/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        if(A.length <= 1){
            return A;
        }
        int start = 0;
        int current = 0;
        
        while(current < A.length){
            if(A[current] % 2 == 0){
                swap(A,current,start);
                start++;
            }
            current++;
        }
        return A;
    }
    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}