num_map = [(5000, 'ↁ'), (4000, 'Mↁ'), (1000, 'M'), (900, 'CM'), (500, 'D'), (400, 'CD'), (100, 'C'), (90, 'XC'),
           (50, 'L'), (40, 'XL'), (10, 'X'), (9, 'IX'), (5, 'V'), (4, 'IV'), (1, 'I')]

num=int(input("Enter num 2 roman: "))
roman = ''
while num > 0:
    for i, r in num_map:
        while num >= i:
            roman += r
            num -= i

print(roman)
