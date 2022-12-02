class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        s = s.lower()
        l_str = int(len(s)/2)
        vow = ['a','e','i','o','u']
        cnt1 = 0
        cnt2 = 0
        for i in range(l_str):
            if(s[i] in vow):
                cnt1 += 1
            if(s[i+l_str] in vow):
                cnt2 += 1
                
        if(cnt1 == cnt2):
            return True
        else:
            return False