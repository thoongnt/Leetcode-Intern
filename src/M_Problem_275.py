from typing import List


class Solution:
    def hIndex(self, citations: List[int]) -> int:
        n = len(citations)
        left, right = 0, n - 1
        while left <= right:
            mid = (left + right) // 2
            if n - mid == citations[mid]:
                return citations[mid]
            elif n - mid < citations[mid]:
                right = mid - 1
            else:
                left = mid + 1
        return n - left


sol = Solution()
print(sol.hIndex([1, 2, 3, 4, 5, 6]))
