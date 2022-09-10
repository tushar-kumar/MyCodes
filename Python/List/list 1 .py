a=eval(input("Enter list which cotain no. 1 to 12: "))
b=[]
for i in a:
    if i<=10:
        b.append(i)
    else:
        b.append(10)
print("Required list is",b)