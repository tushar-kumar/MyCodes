import math
principal = float(input("Enter principal amount: "))
rate = float(input("Enter annual rate of interest: "))
time = int(input("Enter time (in years): "))
choice=int(input("Enter your choice 1 or 2 : "))
if choice == 1:
    interest = (principal * rate * time)/100
    print("Simple Interest = ", interest)
    print("Amount after interest = ", interest + principal)
else:
    n=int(input("Enter no. of times interest is compounded in a year: "))
    rate = rate/100
    periods=time*n
    amount=principal*pow((1+rate/n),periods)
    interest=amount - principal
    print("Compound interest: ", interest)
    print("Amount after interest: ", amount)
