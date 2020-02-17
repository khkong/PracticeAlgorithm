public class Problem200 {

    public int numIslands(char[][] grid) {
        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    checkIslands(grid, i, j);
                    answer++;
                }
            }
        }
        return answer;
    }

    void checkIslands(char[][] grid, int i, int j) {
        if (i < 0 || grid.length <= i)
            return;
        if (j < 0 || grid[i].length <= j)
            return;
        if (grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        checkIslands(grid, i + 1, j); // top
        checkIslands(grid, i - 1, j); // bottom
        checkIslands(grid, i, j - 1); // left
        checkIslands(grid, i, j + 1); // right
    }
}
