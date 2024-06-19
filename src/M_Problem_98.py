from typing import Optional

from TreeNode import TreeNode


class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        arr = list()
        self.preorder(root, arr)
        for i in range(1, len(arr)):
            if arr[i] <= arr[i - 1]:
                return False
        return True

    def preorder(self, root, arr):
        if root.left:
            self.preorder(root.left, arr)
        arr.append(root.val)
        if root.right:
            self.preorder(root.right, arr)
