a=int(input("Enter no. of rows:"))
b=int(input("Enter no. of *'s in a row:"))
print("*"*b)
for i in range(1,a-1):
    print('*',end='')
    print(" "*(b-2),end='')
    print('*')
print("*"*b)