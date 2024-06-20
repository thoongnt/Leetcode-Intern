from typing import List


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        dict_nums = {}
        for i in nums:
            dict_nums[i] = dict_nums.get(i, 0) + 1
        print(dict_nums)
        if k == 0:
            count = 0
            for i in dict_nums.values():
                if i > 1:
                    count += 1
            return count
        else:
            set_nums = set()
            for i in range(len(nums)):
                if nums[i] + k in dict_nums:
                    set_nums.add((nums[i], nums[i] + k))
            return len(set_nums)
