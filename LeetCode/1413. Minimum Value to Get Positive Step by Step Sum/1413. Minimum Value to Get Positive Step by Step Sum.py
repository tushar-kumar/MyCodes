class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        x = 1
        while 1==1:
            z = x
            for num in nums:
                z = z + num
                if z<1:
                    x+=1
                    break
            if z>0:
                return x