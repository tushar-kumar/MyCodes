a = {'name':'Tushar','roll':101,'class':'XI'}
b=a.items()
for i,k in b:
    print(i,k)
print(a.pop('class',"Not Avilable"))