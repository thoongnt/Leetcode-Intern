class Solution:
    def reverse(self, x: int) -> int:
        flag = False
        result = 0
        if x < 0:
            flag = True
        x = abs(x)
        while x > 0:
            result = result * 10 + x % 10
            x //= 10
        if flag:
            result = -result
        if result > 2 ** 31 - 1 or result < -2 ** 31:
            return 0
        return result
