while 1==1:
    a = int(input("Enter first No.: "))
    b = input("operator: ")
    c = int(input("Enter 2nd No.: "))
    if b == '+':
        print(a + c)
    elif b == '-':
        print(a - c)
    elif b == '*':
        print(a * c)
    elif b == '/':
        print(a / c)
    elif b == '^':
        print(a ** c)
    else:
        print("Invalid Input")