def selection(s):
    for i in range(0,len(s)-1):
        p=0
        mini=s[-1]
        for j in range(i,len(s)):
            if s[j]<=mini:
                mini=s[j]
                p=j
        s[i],s[p]=s[p],s[i]
print(s)
selection([2,3,4,2,1,1,1,2])