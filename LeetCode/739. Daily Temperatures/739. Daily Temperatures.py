class Solution:
    def dailyTemperatures(self, temps: List[int]) -> List[int]:
        res = [0]* len(temps)
        stack = []

        for i, temp in enumerate(temps):
            while stack and temp > temps[stack[-1]]:
                ind = stack.pop()
                res[ind] = i - ind
            stack.append(i)
        
        return res

        
        # for i in range(0,len(temps)):
        #     c = 0
        #     for j in range(i+1,len(temps)):
        #         if(temps[j]>temps[i]):
        #             res.append(j-i)
        #             c=1
        #             break
        #     if(c==0):
        #         res.append(0)
        # return res

