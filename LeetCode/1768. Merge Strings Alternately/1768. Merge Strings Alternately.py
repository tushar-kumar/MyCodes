class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        ans = ''
        l1= len(word1)
        l2= len(word2)
        for i in range(l1 if l1>l2 else l2):
            if i<l1:
                ans+=word1[i]
            if i<l2:
                ans+=word2[i]
        return ans