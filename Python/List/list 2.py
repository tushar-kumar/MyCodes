nterms = int(input("Enter n term of fiboncci series:"))
n1 = 0
n2 = 1
count = 0

if nterms <= 0:
   print("Please enter a positive integer")
else:
   while count < nterms:
       nth = n1 + n2
       n1 = n2
       n2 = nth
       count += 1
   print(nterms,"th term of Fibonacci sequence is",n1)