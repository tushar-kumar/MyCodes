
def insertion_sort(arr):
    for idx in range(1, len(arr)):
        scan = idx
        while scan > 0 and arr[scan] < arr[scan-1]:
            swap(arr, scan, scan-1)
            scan -= 1
    return arr

def swap(arr, idx1, idx2):
    arr[idx1], arr[idx2] = arr[idx2], arr[idx1]

arr_to_sort = [1, 10, 3, 2]
print(insertion_sort(arr_to_sort))  