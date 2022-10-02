class Solution:
    def maxArea(self, height: List[int]) -> int:
        a = 0;
        for j in range(0,len(height)):
            for i in range(j,len(height)):
                if(height[j]<height[i]):
                    if(a<height[j]*(i-j)):
                        a = height[j]*(i-j)
                else:
                    if(a<height[i]*(i-j)):
                        a=height[i]*(i-j)
        return a