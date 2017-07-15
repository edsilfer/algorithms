# -*- coding: utf-8 -*- 

# **************************************** #
#       INSERTION SORT ALGORITHM
# ---------------------------------------- #
# Description: sort in crescent order an   #
# array of 'n' element;                    #
#					   #
# Time complexity: nˆ2			   #
# **************************************** #

def sort (input):
    for j in range(1, len(input)):
        key = input[j]
        k = j
        while k > 0 and key < input[k - 1]:
            input[k] = input[k - 1]
            k-=1
        input[k] = key
    return input
