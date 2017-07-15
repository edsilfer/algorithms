from Tree import *

# ********************************************** #
#          SAMPLE TREE APPLICATION
# ********************************************** #
#                     44
#                    / \
#                   /   \
#                  /     \
#                 /       \
#                /         \
#              30          52
#             /  \        /  \
#           20    35     49  70
#          / \   /  \       /  \
#         5  22 31  40     65  93
#                         /  \
#                        64  69
# *********************************************** #

CONST_INPUT = [30, 52, 20, 35, 49, 70, 5, 22, 31, 40, 65, 93, 64, 69]
tree = Tree(44)


def print_linked_list(start):
    while start:
        print start.data,
        start = start.right


# MAIN
for value in CONST_INPUT:
    tree.insert(value)

print "PARSE PRE ORDER: "
tree.print_pre_order()

print "\n\nPARSE IN ORDER: "
tree.print_in_order()

print "\n\nPARSE POST ORDER: "
tree.print_post_order()

print "\n\nROOT HEIGHT: " + str(tree.height())

print "\nCONVERT TO DOUBLE LINKED LIST: "
result = tree.convert_to_linked_list()
print_linked_list(result)
