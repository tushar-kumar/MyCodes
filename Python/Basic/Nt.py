N = int(input("Enter no. > 20:"))
for i in range(11,N):
    print(i,' ', end='')
if N%3 == 0 and N%7 == 0:
        print("\nTipsyTopsy")
elif N % 3 == 0:
    print("\nTipsy")
elif N%7 == 0:
    print("\nTopsy")
else:
    print("Invalid Input")