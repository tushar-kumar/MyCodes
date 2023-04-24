class Solution:
    def bstToGst(self, root: TreeNode) -> TreeNode:
        prefix = 0
        
        def reversed_inorder(root):
            nonlocal prefix
            if root is None:
                return
            
            reversed_inorder(root.right)
            
            root.val += prefix
            prefix = root.val
            
            reversed_inorder(root.left)
            
        reversed_inorder(root)
        return root