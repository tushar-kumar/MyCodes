a=eval(input("Enter list 1st: "))
b=eval(input("Enter list 2nd: "))
len=len(a)
c=[]
for i in range(0,len):
    d=a[i]+b[i]
    c.append(d)
print(c)