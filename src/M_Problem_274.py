from typing import List


class Solution:
    def hIndex(self, citations: List[int]) -> int:
        citations.sort()
        result = 0
        for i in range(len(citations) - 1, -1, -1):
            if result + 1 > citations[i]:
                return result
            result += 1
        return result
