class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        x = 0
        y = 0
        while len(stones)>1:
            x = max(stones)
            stones.remove(x)
            y = max(stones)
            stones.remove(y)
            stones.append(abs(x-y))

        return stones[0]