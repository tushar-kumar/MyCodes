
from heapq import heapify


def heap_sort(list):
    n = len(list)
    # First step: turn list into a heap
    heapify(list)
    print(list)
    # Second step: repeatedly place next
    # smallest value at end of the list
    for idx in range(n-1, 0, -1):
        swap(0, idx, list)
        bubble_down(0, idx-1, list)


def swap(idx1, idx2, list):
    list[idx1], list[idx2] = list[idx2], list[idx1]


def bubble_down(current_idx, last_idx, heap):
    # Method used to restore heap order property when violated
    child_one_idx = current_idx * 2 + 1
    while child_one_idx <= last_idx:
        child_two_idx = current_idx * 2 + 2 if current_idx*2 + 2 <= last_idx else -1

        if child_two_idx > -1 and heap[child_two_idx] < heap[child_one_idx]:
            idx_to_swap = child_two_idx
        else:
            idx_to_swap = child_one_idx

        if heap[idx_to_swap] < heap[current_idx]:
            swap(current_idx, idx_to_swap, heap)
            current_idx = idx_to_swap
            child_one_idx = current_idx * 2 + 1
        else:
            return


list = [1, 10, 4, 3, 2]
heap_sort(list)

print(list)  # [10, 4, 3, 2, 1]
# Ascending order
list.reverse()
print(list)  # [1, 2, 3, 4, 10]