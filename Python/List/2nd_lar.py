a=[]
n=int(input("Enter number of elements:"))
for i in range(1,n+1):
    b=int(input("Enter element:"))
    a.append(b)
print("Largest no. in the list is", max(a))
a.remove(max(a))
print("2nd largest no. in the list is", max(a))