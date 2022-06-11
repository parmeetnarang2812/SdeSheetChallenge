class Solution {

    public void rotate(int[][] matrix) {
        // transpose
        transpose(matrix);
        // reverse row
        reverseRow(matrix);
    }

    private void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    private void reverseRow(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {  // for every row
            int i = 0, j = arr.length - 1;
            while (i < j) {
                int temp = arr[r][i];
                arr[r][i] = arr[r][j];
                arr[r][j] = temp;
                i++;
                j--;
            }
        }
    }
}
