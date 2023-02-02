class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        len1 = len(str1)
        len2 = len(str2)
        max_len = min(len1, len2)

        for i in range(max_len, 0, -1):
            if len1 % i == 0 and len2 % i == 0 and str1[:i] == str2[:i]:
                tmp1 = str1[i:] + str1[:i]
                tmp2 = str2[i:] + str2[:i]
                if tmp1 == str1 and tmp2 == str2:
                    return str1[:i]
        
        return ""