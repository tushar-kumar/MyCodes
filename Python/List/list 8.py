a=eval(input("Enter a list:"))
b=[]
b.append(a[-1])
for i in a[:len(a)-1]:
    b.append(i)
print(b)