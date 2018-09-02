package data_structure.tree;

/**
 * 二叉树的结点
 */
public class TreeNode {
    public TreeNode parent;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(TreeNode parent, TreeNode leftChild, TreeNode rightChild) {
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

}
