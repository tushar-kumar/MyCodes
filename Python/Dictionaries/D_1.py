n = int(input("Enter no. team's data U want to store:"))
d={}
for i in range(1,n+1):
    k=input("Enter Team Name:")
    v=eval(input("Enter [wins/loses]:"))
    d[k]=v
c=[]
e=[]
a = input("Enter team name for winning %age:")
for ke,vl in d.items():
    if ke == a:
        b=vl[0]*100/sum(vl)
        print(ke,"winning %age is",b,'%')
        if b>50:
            e.append(ke)
    c.append(vl[0])
print("Match winning list is",c)
print("Win record teams are",e)
