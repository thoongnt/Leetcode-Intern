from collections import deque


class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        q = deque()
        result = 0
        for i in s:
            if i not in q:
                q.append(i)
            else:
                while i in q:
                    result = max(result, len(q))
                    q.popleft()
                q.append(i)
        return max(result, len(q))
