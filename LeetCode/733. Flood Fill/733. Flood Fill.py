class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
    
        sColor = image[sr][sc]
        seen = set()

        def flo(i: int, j: int) -> None:
            if i < 0 or i == len(image) or j < 0 or j == len(image[0]):
                return
            if image[i][j] != sColor or (i, j) in seen:
                return

            image[i][j] = color
            seen.add((i, j))

            flo(i + 1, j)
            flo(i - 1, j)
            flo(i, j + 1)
            flo(i, j - 1)

        flo(sr, sc)
        return image