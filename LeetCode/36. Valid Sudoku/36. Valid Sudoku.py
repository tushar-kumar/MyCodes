class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range(9):
            st1 = set()
            st2 = set()
            st3 = set()
            for j in range(9):
                if board[i][j] in st1:
                    return False
                if board[i][j] != '.':
                    st1.add(board[i][j])

                if board[j][i] in st2:
                    return False
                if board[j][i] != '.':
                    st2.add(board[j][i])

                if j%3 == 0 and i%3 == 0:
                    for k in range(i,i+3):
                        for l in range(j,j+3):
                            if board[k][l] in st3:
                                return False
                            if board[k][l] != '.':
                                st3.add(board[k][l])
                    st3 = set()
        return True
                            