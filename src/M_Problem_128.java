import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class M_Problem_128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) return nums.length;
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr[i++] = num;
        }
        Arrays.sort(arr);
        int max = 1;
        int count = 1;
        for (int idx = 1; idx < arr.length; idx++) {
            if (arr[idx] - arr[idx - 1] == 1) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
