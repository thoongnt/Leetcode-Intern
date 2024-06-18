public class H_Problem_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int idxNums1 = 0;
        int idxNums2 = 0;
        int[] arr = new int[nums1.length + nums2.length];
        int idxArr = 0;
        while (idxNums1 < nums1.length && idxNums2 < nums2.length) {
            if (nums1[idxNums1] <= nums2[idxNums2]) {
                arr[idxArr++] = nums1[idxNums1++];
            } else {
                arr[idxArr++] = nums2[idxNums2++];
            }
        }
        while (idxNums1 < nums1.length) {
            arr[idxArr++] = nums1[idxNums1++];
        }
        while (idxNums2 < nums2.length) {
            arr[idxArr++] = nums2[idxNums2++];
        }

        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        }
        return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
    }
}
