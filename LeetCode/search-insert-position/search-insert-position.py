class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        res = 0
        for x in nums:
            if(target <= x):
                return res
            res = res+1
        return res
        