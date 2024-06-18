public class M_Problem_45 {
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0;
        int step = 0;
        int endStep = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            step = Math.max(step, nums[i] + i);
            if (step >= nums.length - 1) {
                count++;
                break;
            }
            if (i == endStep) {
                count++;
                endStep = step;
            }
        }
        return count;
    }
}
