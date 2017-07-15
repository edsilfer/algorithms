import sys

sys.path.insert(0, '../')

from Utils import *
from merge_sort import sort

# MAIN
print ("Unsorted list is: {0}".format(ARRAY_10))
sorted = sort(ARRAY_10)
print ("Sorted list is:   {0}".format(sorted))

