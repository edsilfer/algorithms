class TreeNode(object):
    def __init__(self):
        self.left = None
        self.right = None
        self.data = None

class Tree(object):
    def __init__(self, value):
        self.root = TreeNode()
        self.root.data = value
        self.path = []
        self.aux = False
        pass

    def __insert_internal(self, node, value):
        if value < node.data:
            if node.left is not None:
                self.__insert_internal(node.left, value)
            else:
                left = TreeNode()
                left.data = value
                node.left = left
        else:
            if node.right is not None:
                self.__insert_internal(node.right, value)
            else:
                right = TreeNode()
                right.data = value
                node.right = right

    pass

    def insert(self, value):
        self.__insert_internal(self.root, value)
        pass

    def __print_pre_order(self, node):
        if node is None: return
        print node.data,
        self.__print_pre_order(node.left)
        self.__print_pre_order(node.right)
        pass

    def print_pre_order(self):
        self.__print_pre_order(self.root)

    def __print_in_order(self, node):
        if node is None: return
        self.__print_in_order(node.left)
        print node.data,
        self.__print_in_order(node.right)
        pass

    def print_in_order(self):
        self.__print_in_order(self.root)

    def __print_post_order(self, node):
        if node is None: return
        self.__print_post_order(node.left)
        self.__print_post_order(node.right)
        print node.data,
        pass

    def height(self):
        return self.__height(self.root)

    def __height(self, node):
        if node is None:
            return 0
        return max(self.__height(node.left), self.__height(node.right)) + 1

    def __convert_to_linked_list(self, node):
        if node is None:
            return {'left': node, 'right': node}

        result = self.__convert_to_linked_list(node.left)
        node.left = result['right']
        if node.left is not None:
            node.left.right = node
        result = self.__convert_to_linked_list(node.right)
        node.right = result['left']
        if node.right is not None:
            node.right.left = node

        return {'left': self.__get_left_most(node), 'right': self.__get_right_most_node(node)}

    def __get_left_most(self, node):
        if node is not None and node.left is not None and node.left.data < node.data:
            return node.left
        else:
            return node

    def __get_right_most_node (self, node):
        if node is not None and node.right is not None and node.right.data > node.data:
            return node.right
        else:
            return node

    def convert_to_linked_list(self):
        self.__convert_to_linked_list(self.root)
        return self.__get_first_element_from_linked_list(self.root)

    def __get_first_element_from_linked_list(self, node):
        first = node
        while first.left is not None:
            first = first.left
        return first

    def print_post_order(self):
        self.__print_post_order(self.root)

