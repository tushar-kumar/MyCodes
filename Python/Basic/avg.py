n=int(input("Enter the number of elements you want to insert in list: "))
a=[]
for i in range(0,n):
    elem=int(input("Enter element: "))
    a.append(elem)
avg=sum(a)/n
print("Average of elements of the list",avg)