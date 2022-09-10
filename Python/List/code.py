n=input("Enter any integer/string:")
b=len(n)
s=''
for a in range(-1,(-b-1),-1):
    s=s+(n[a])
if (n)==(s):
    print(n,"is a palindrome.")
else:
    print(n,"is not a palindrome.")