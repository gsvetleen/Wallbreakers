class Solution {
    public int findCircleNum(int[][] M) {
        int friendCircle = 0;
        int size = M.length;
        Boolean[] visited = new Boolean[size];
        Arrays.fill(visited,false);
        for(int i = 0; i < size; i++){
            if(!visited[i]){
                dfs(M,i,visited);
                friendCircle +=1;
            }
        }
        return friendCircle;
    }
    
    public void dfs(int[][] M, int student, Boolean[] visited){
        visited[student] = true;
        for(int j = 0; j < M.length; j++){
            if(!visited[j] && M[student][j] == 1){
                dfs(M,j,visited);
            }
        }
    }
}