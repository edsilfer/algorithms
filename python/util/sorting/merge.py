# -*- coding: utf-8 -*-

# **************************************** #
#          MERGE SORT ALGORITHM
# ---------------------------------------- #
# Description: sort in crescent order an   #
# array of 'n' element;                    #
#                                          #
# Time complexity: n log n                 #
# **************************************** #
def sort (input):
    if len(input) > 1:
        middle = len(input)/2

        left = input[:middle]
        right = input[middle:]

        sort (left)
        sort (right)

        i = 0
        j = 0
        k = 0

        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                input[k] = left[i]
                i += 1
            else:
                input[k] = right[j]
                j += 1
            k += 1

        while i < len(left):
            input[k] = left[i]
            i += 1
            k += 1

        while j < len(right):
            input[k] = right[j]
            j += 1
            k += 1
    return input
