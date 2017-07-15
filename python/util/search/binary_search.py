import os
import sys
import traceback

INPUT = [0, 1, 3, 5, 8, 15, 23, 32, 54, 100, 101, 102, 150, 200]

def binarySearch (array, target):
	middle = len(array)/2

	if array[middle] == target: return "yes"
	if middle == 0: return "no"

	if target > array[middle]:
		result = binarySearch(array[middle + 1:], target)
	elif target < int(array[middle]):
		result = binarySearch(array[:middle], target)

	return result

# ====
# MAIN
# ====
try:
	b = sys.argv[1]
	if b == "print input":
		print(INPUT)
	else:
		c = binarySearch(INPUT, int(b))
		print ("Looking for {0} in {1}. Found? {2}".format(b, INPUT, c))
except:
	print ("You need to pass a value to search for...")
	traceback.print_exc()
