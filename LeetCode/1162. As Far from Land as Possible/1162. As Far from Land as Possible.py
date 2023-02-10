class Solution:
    def maxDistance(self, grid: List[List[int]]) -> int:
        m, n, water, q, dirs = len(grid), len(grid[0]), 0, collections.deque(), [0, 1, 0, -1, 0]
        for i in range(m):
            for j in range(n):
                if grid[i][j] == 0:
                    water += 1
                else:
                    q.append((i, j))

        if water == 0 or water == m * n:
            return -1

        ans = 0
        d = 0
        while q:
            for _ in range(len(q)):
                i, j = q.popleft()
                ans = d
                for k in range(4):
                    x, y = i + dirs[k], j + dirs[k + 1]
                    if x >= 0 and x < m and y >= 0 and y < n and not grid[x][y]:
                        q.append((x, y))
                        grid[x][y] = 2
            d += 1

        return ans