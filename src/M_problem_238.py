from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        arr = [1] * len(nums)
        val = 1
        for i in range(len(nums)):
            arr[i] = val
            val *= nums[i]
        val = 1
        for i in range(len(nums) - 1, -1, -1):
            arr[i] *= val
            val *= nums[i]
        return arr
