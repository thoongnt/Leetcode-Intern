import java.util.LinkedList;
import java.util.List;

public class M_Problem_57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List list = new LinkedList();
        int i = 0;
        int n = intervals.length;
        while (i < n) {
            if (intervals[i][1] < newInterval[0]) {
                list.add(intervals[i]);
            } else if (intervals[i][0] > newInterval[1]) {
                break;
            } else {
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
            i++;
        }
        list.add(newInterval);
        while (i < n) {
            list.add(intervals[i]);
            i++;
        }
        return (int[][]) list.toArray(new int[list.size()][2]);
    }
}
