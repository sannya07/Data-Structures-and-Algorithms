class Solution {
    public void dfs(int row, int col, int[][] ans, int[][] image, int initialColor, int color, int[] deltaRow, int[] deltaCol) {
        int n = image.length;
        int m = image[0].length;
        
        // Check if the current pixel is out of bounds or not matching initial color or already colored
        if (row < 0 || row >= n || col < 0 || col >= m || 
            image[row][col] != initialColor || ans[row][col] == color) {
            return;
        }
        
        ans[row][col] = color;
        
        // Explore 4 adjacent directions
        for (int i = 0; i < 4; i++) {
            int nRow = deltaRow[i] + row;
            int nCol = deltaCol[i] + col;
            dfs(nRow, nCol, ans, image, initialColor, color, deltaRow, deltaCol);
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Skip if the new color is the same as the initial color
        if (image[sr][sc] == color) {
            return image;
        }
        
        int initialColor = image[sr][sc];
        
        // Create a copy of the image to avoid modifying the original
        int[][] ans = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            ans[i] = image[i].clone();
        }
        
        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};
        
        dfs(sr, sc, ans, image, initialColor, color, deltaRow, deltaCol);
        
        return ans;
    }
}
