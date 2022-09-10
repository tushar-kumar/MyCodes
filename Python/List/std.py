a=input("Enter String: ")
b=len(a)
c=0
for i in range(1,b+1):
    if a[i].isalnum():
        if a[i].isdigit():
            c = c + int(a[i])
            continue
    elif a.isalpha():
        print(a,"has no digit.")
print(a,"has digits which sum is",c)