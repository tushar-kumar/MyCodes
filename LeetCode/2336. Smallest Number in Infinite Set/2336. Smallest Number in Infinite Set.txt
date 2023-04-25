from sortedcontainers import SortedSet

class SmallestInfiniteSet:

    def __init__(self):
        self.curr = 1
        self.added = SortedSet()
        

    def popSmallest(self) -> int:
        if not self.added:
            result = self.curr
            self.curr += 1
            return result
        else:
            return self.added.pop(0)
        

    def addBack(self, num: int) -> None:
        if num < self.curr:
            self.added.add(num)
        