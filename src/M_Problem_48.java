public class M_Problem_48 {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[j][size - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
