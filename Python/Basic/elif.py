import math
d=1
while d<=5:
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
    elif b == 'pow':
        print(a ** c)
    elif b == 'sqrt':
        print('\t sqrt of 1st no. is')
        print(math.sqrt(a))
        print('\t sqrt of 1st no. is')
        print(math.sqrt(c))
    else:
        print("Invalid Input")