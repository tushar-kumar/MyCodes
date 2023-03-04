class Solution:
    def countSubarrays(self, nums: List[int], minK: int, maxK: int) -> int:
        ans = 0
        j = -1
        pMin = -1
        pMax = -1

        for i, num in enumerate(nums):
            if num < minK or num > maxK:
                j = i
            if num == minK:
                pMin = i
            if num == maxK:
                pMax = i

            ans += max(0, min(pMin, pMax) - j)

        return ans