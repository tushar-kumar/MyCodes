def bubbleSort(lis):
    length = len(lis)
    for i in range(length):
        for j in range(length - i):
            a = lis[j]
            if a != lis[-1]:
                b = lis[j + 1]
                if a > b:
                    lis[j] = b
                    lis[j + 1] = a
    return lis