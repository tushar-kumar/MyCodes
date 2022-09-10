a=[]
b=1
for i in range(97,123):
    c=(chr(i)*b)
    a.append(c)
    b+=1
print(a)