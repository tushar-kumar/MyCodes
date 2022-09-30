class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i=0
        for x in nums:
            if(x==val):
                i=i+1
        for i in range(i):
            nums.remove(val)
            
        return len(nums)