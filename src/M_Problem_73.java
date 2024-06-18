import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class M_Problem_73 {
//    public void setZeroes(int[][] matrix) {
//        Set<Integer> rowsZero = new HashSet<>();
//        Set<Integer> colsZero = new HashSet<>();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == 0) {
//                    rowsZero.add(i);
//                    colsZero.add(j);
//                }
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (rowsZero.contains(i) || colsZero.contains(j))
//                    matrix[i][j] = 0;
//            }
//        }
//    }

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] == true || cols[j] == true)
                    matrix[i][j] = 0;
            }
        }
    }
}
