a=eval(input("Enter a list: "))
e=int(input("Enter element: "))
if e in a:
    c = a.index(e)
    print(e,"found at index at",c)
else:
    print(e,"is not found in list.")