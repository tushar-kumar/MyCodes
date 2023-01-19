class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        
        ans = 0
        pre = 0
        count = [1] + [0] * (k - 1)

        for num in nums:
            pre = (pre + num) % k
            ans += count[pre]
            count[pre] += 1

        return ans