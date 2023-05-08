class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        m = len(mat)
        if m == 1: return mat[0][0]

        count = 0
        for i in range(m):
            count += mat[i][i]
            count += mat[i][-1 - i]

        if m % 2 == 1: count -= mat[m // 2][m // 2]

        return count