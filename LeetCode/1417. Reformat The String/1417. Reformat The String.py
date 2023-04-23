class Solution:
    def reformat(self, s: str) -> str:
        nums = ''
        alp = ''
        ans = ''
        for char in s:
            if char.isalpha():
                alp += char
            
            elif char.isnumeric():
                nums += char
        if abs(len(nums)-len(alp)) > 1:
            return ans
        else:
            if len(nums) > len(alp):
                for i in range(len(alp)):
                    ans = ans + nums[i] + alp[i]
                ans = ans + nums[-1]
            elif len(nums) < len(alp):
                for i in range(len(nums)):
                    ans = ans + alp[i] + nums[i]
                ans = ans + alp[-1]
            else:
                for i in range(len(alp)):
                    ans = ans + alp[i] + nums[i]
        
        return ans