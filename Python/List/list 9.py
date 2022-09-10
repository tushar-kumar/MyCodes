a=eval(input("Enter a list:"))
b,c=[],[]
print("Original list:",a)
for i in a:
    if i is not 0:
        b.append(i)
    else:
        c.append(i)
b.extend(c)
print("Zero shifted:",b)