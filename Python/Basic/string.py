string=input("Enter a sitring:")
count = 3
while True:
    if string[0]=='a':
        string = string[2:]
    elif string[-1]=='b':
        string = string[:2]
    else:
        count += 1
        break
print(string)
print(count)