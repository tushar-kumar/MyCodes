a=int(input("Enter 1st no.:"))
b=int(input("Enter 2nd no.:"))
c=int(input("Enter 3rd no.:"))
if b<a>c:
    print("Highest number =",a)
    if b<c:
        print("Next hiigher no.=",b)
        print("Smallest no.=",c)
    else:
        print("Next hiigher no.=", c)
        print("Smallest no.=", b)
