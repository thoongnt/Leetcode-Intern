from typing import Optional

from TreeNode import TreeNode


class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        arr = list()
        self.preorder(root, arr)
        return arr[k - 1]

    def preorder(self, root, arr):
        if root.left:
            self.preorder(root.left, arr)
        arr.append(root.val)
        if root.right:
            self.preorder(root.right, arr)
