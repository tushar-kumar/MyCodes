a=input("Enter a string: ")
b=''
c=0
for i in a:
    if i.isdigit():
        b+=i
        c+=int(i)
if b=='':
    print(a,"has no digit.")
else:
    print(a,"has digits",b,"which sum to",c)