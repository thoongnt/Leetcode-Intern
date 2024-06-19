import java.util.*;

public class M_Problem_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            sum(-nums[i], i + 1, nums, list);
        }
        return list;
    }

    public void sum(int target, int start, int[] nums, List<List<Integer>> list) {
        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum < target) {
                start++;
                continue;
            } else if (sum > target) {
                end--;
                continue;
            }
            list.add(Arrays.asList(-target, nums[start++], nums[end--));
            while (start < end && nums[end] == nums[end + 1]) end--;
        }
    }
}
