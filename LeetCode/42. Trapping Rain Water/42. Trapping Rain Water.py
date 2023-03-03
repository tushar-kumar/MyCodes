class Solution:
    def trap(self, height: List[int]) -> int:
        if not height:
            return 0
        ans = 0
        
        # for h in height:
        #     if h > 0 and cnt == 0:
        #         p = h
        #         cnt =1
        #     else:
        #         if h < p:
        #             ans = ans + (p-h)
        #         else:
        #             p = h
        # if height[-1] < p:
        #     for h in 

        # return ans
        l = 0
        r = len(height) - 1
        maxL = height[l]
        maxR = height[r]

        while l < r:
            if maxL < maxR:
                ans += maxL - height[l]
                l += 1
                maxL = max(maxL, height[l])
            else:
                ans += maxR - height[r]
                r -= 1
                maxR = max(maxR, height[r])

        return ans