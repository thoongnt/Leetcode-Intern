class Solution:
    def isNumber(self, s: str) -> bool:
        dot = False
        number = False
        ex = False
        for i in range(len(s)):
            if s[i].isdigit():
                number = True
            elif s[i] == "e" or s[i] == "E":
                if not number or ex:
                    return False
                ex = True
                number = False
            elif s[i] == ".":
                if dot or ex:
                    return False
                dot = True
                ex = False
            elif s[i] == "+" or s[i] == "-":
                if i > 0 and s[i - 1] not in ("e", "E"):
                    return False
                number = False
            else:
                return False
        return number