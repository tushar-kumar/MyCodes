class Solution:
    def validPath(self, n: int, edges: List[List[int]], start: int, end: int) -> bool:
        def dfs(adj, start, target):
            stk = [start]
            lookup = set(stk)
            while stk:
                pos = stk.pop()
                if pos == target:
                    return True
                for nei in reversed(adj[pos]):
                    if nei in lookup:
                        continue
                    lookup.add(nei)
                    stk.append(nei)
            return False 

        adj = collections.defaultdict(list)
        for u, v in edges:
            adj[u].append(v)
            adj[v].append(u)
        return dfs(adj, start, end)