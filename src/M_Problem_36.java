import java.util.HashSet;
import java.util.Set;

public class M_Problem_36 {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; i++) {
                String str = board[i][j] + "";
                if (!set.add(i + str) || !set.add(str + j) || !set.add(i / 3 + str + j / 3))
                    return false;
            }
        }
        return true;
    }
}
