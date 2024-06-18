import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class M_Problem_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List list = new LinkedList();
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (prev[1] >= intervals[i][0]) {
                prev[1] = Math.max(prev[1], intervals[i][1]);
            } else {
                list.add(prev);
                prev = intervals[i];
            }
        }
        list.add(prev);
        return (int[][]) list.toArray(new int[list.size()][]);
    }
}
