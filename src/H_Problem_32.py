class Solution:
    def longestValidParentheses(self, s: str) -> int:
        stack = []
        cur_len = 0
        result = 0
        for i in s:
            if i == '(':
                stack.append(cur_len)
                cur_len = 0
            else:
                if len(stack) == 0:
                    cur_len = 0
                else:
                    cur_len += stack.pop() + 2
                    result = max(cur_len, result)
        return result


sol = Solution()
print(sol.longestValidParentheses('()(())'))
