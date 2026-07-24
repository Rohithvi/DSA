class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];
            for (int i = 0; i < n; i++) {
                matrix[row][i]++;
            }
            for (int j = 0; j < m; j++) {
                matrix[j][col]++;
            }
        }
        int count = 0;
        for (int[] rows : matrix) {
            for (int value : rows) {
                if (value % 2 == 1) {
                    count++;
                }
            }
        }

        return count;
    }

}
