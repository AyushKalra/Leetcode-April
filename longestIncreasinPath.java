class Solution {
    int n, m;
    int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int longestIncreasingPath(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        int max = 0;
        int[][] path = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                max = Math.max(max, findLongestPath(i, j, matrix, path));
            }
        }
        return max;
    }
    
    private int findLongestPath(int i, int j, int[][] matrix, int[][] path)
    {
        if (path[i][j] != 0)
        {
            return path[i][j];
        }
        
        int max = 0;
        for (int[] dir : dirs)
        {
            int di = i + dir[0];
            int dj = j + dir[1];
            if (di < 0 || di >= n || dj < 0 || dj >=m || matrix[i][j] >= matrix[di][dj])
            {
                continue;
            }
            
            max = Math.max(max, findLongestPath(di, dj, matrix, path));
        }
        path[i][j] = 1 + max;
        return path[i][j];
    }
}