class Solution {
    public void dfs(int i,int j,char[][] grid,boolean[][] visited){
        int rows=grid.length;
        int cols=grid[0].length;
        if(i<0 || j<0 || i>=rows || j>=cols || grid[i][j]=='0' || visited[i][j]){
            return;
        }
        visited[i][j]=true;
        dfs(i+1,j,grid,visited);
        dfs(i-1,j,grid,visited);
        dfs(i,j+1,grid,visited);
        dfs(i,j-1,grid,visited);
        
    }
    public int numIslands(char[][] grid) {
        if(grid== null || grid.length ==0){
            return 0;
        }

        int rows=grid.length;
        int cols=grid[0].length;

        int count=0;
        boolean[][] visited=new boolean[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    dfs(i,j,grid,visited);
                }
            }
        } 
        return count;
    }

}