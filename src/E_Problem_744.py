from typing import List


class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        if target < letters[0] or target >= letters[-1]:
            return letters[0]
        left, right = 0, len(letters) - 1
        while left <= right:
            mid = (left + right) // 2
            if target >= letters[mid]:
                left = mid + 1
            else:
                right = mid - 1
        return letters[left]


    # def nextGreatestLetter(self, letters: List[str], target: str) -> str:
    #     for i in letters:
    #         if i > target:
    #             return i
    #     return letters[0]
