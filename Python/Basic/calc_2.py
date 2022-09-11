while 1==1:
    try:
        a=input("Calculate:")
        print(a,'=',eval(a))
    except SyntaxError:
        print("Invalid Input")