import java.util.LinkedList;
import java.util.List;

public class M_Problem_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        int a = 0;
        int b = matrix.length - 1;
        int c = 0;
        int d = matrix[0].length - 1;
        while (a <= b && c <= d) {
            for (int i = c; i < d; i++) {
                list.add(matrix[a][i]);
            }
            a++;
            for (int i = a; i < b; i++) {
                list.add(matrix[i][d]);
            }
            d--;
            if (a <= b) {
                for (int i = d; i >= c; i--) {
                    list.add(matrix[b][i]);
                }
                b--;
            }
            if (c <= d) {
                for (int i = b; i >= a; i--) {
                    list.add(matrix[i][c]);
                }
                c++;
            }
        }
        return list;
    }
}
