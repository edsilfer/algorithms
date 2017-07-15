import sys
import traceback

def isEven(n):
        return n%2 == 0

def power (a, n):
	if n == 0: return 1
	x = power (a, (n/2))
	if isEven(n): return x * x
	else: return a * x * x

# MAIN
try:
	a = int(sys.argv[1])
	n = int(sys.argv[2])
	result = power(a, n)
	print ("{0} power {1} is {2}".format(a, n, result))
except:
	print("You need to pass two arguments: base and exponent")
	traceback.print_exc()

