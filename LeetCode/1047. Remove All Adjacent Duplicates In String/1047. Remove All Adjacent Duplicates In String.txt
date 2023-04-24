class Solution:
    def removeDuplicates(self, s: str) -> str:
        # c = 1
        # while c != 0:
        #     c = 0
        #     for i in range(len(s)):
        #         if len(s)>1 and i!=len(s)-1 and s[i] == s[i+1]:
        #             s = s.replace(s[i]+s[i],'')
        #             c = 1
        #             break
        
        # return s

        chars = list(s)
        i = -1
        for c in chars:
            if i >= 0 and c == chars[i]:
                i -= 1
            else:
                i += 1
                chars[i] = c
        return ''.join(chars[:i + 1])