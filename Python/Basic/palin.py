n=(input("Enter ant integer/string:"))
rev_num=reversed(n)
print(rev_num)
if list(n)==list(rev_num):
    print("Yes it is a palidrome")
else:
    print("NO it isn't a palidrome")