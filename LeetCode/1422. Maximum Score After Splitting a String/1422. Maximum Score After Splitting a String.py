class Solution:
    def maxScore(self, s: str) -> int:
        ans = 0 
        for i in range(1,len(s)):
            a = s[0:i].count('0') + s[i:].count('1')
            if a>ans: ans = a
        
        return ans