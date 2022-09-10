P=0
N=0
M=0
n=int(input("Enter No. of emp.:"))
for a in range(1,n):
    age=int(input("Enter emp. age:"))
    if age>=26 and age<=35:
        P=P+1
    elif 36<=age<=45:
        N=N+1
    elif 46<=age<=55:
        M=M+1
    else:
        print("Input is too small or large")
print("Emp. in 26-35 age group are",P)
print("Emp. in 36-45 age group are",N)
print("Emp. in 46-55 age group are",M)