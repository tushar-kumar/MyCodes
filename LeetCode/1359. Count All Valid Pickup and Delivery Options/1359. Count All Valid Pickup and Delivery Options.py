class Solution:
    def countOrders(self, n: int) -> int:
        mod = 1000000007
        ans = 1

        for i in range(1, n+1):
            ans = ans * i * (i * 2 -1) % mod
        return ans