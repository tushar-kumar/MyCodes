def a(arr, i ,s, len):
	if (i == 0):
		print(s)
		return

	for j in range(0,len):
		append = s+arr[j]
		a(arr, i -1, append, len)

	return

def b(arr,len):
	for i in range(1,len+1):
		a(arr,i,"",len)


arr= 'abc'
len = len(arr)
b(arr,len)
