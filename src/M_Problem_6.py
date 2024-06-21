class Solution:
    def convert(self, s: str, numRows: int) -> str:
        matrix = [[] for _ in range(numRows)]
        i = 0
        n = len(s)
        while i < n:
            for j in range(numRows):
                if i < n:
                    matrix[j].append(s[i])
                    i += 1
            for j in range(numRows - 2, 0, -1):
                if i < n:
                    matrix[j].append(s[i])
                    i += 1
        result = ""
        for arr in matrix:
            for c in arr:
                result += c
        return result
