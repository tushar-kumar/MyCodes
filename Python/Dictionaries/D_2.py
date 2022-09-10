str_list=eval(input("Enter list of strings: "))
b=0
for i in str_list:
    if len(i)>b:
        b=len(i)
        word=i
print(word,"is the longest string with length ", b)


