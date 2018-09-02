package data_structure.tree;

/**
 * 二叉搜索树
 * 常见操作：前根，后根，中跟，层次遍历；
 *          插入，删除，查找；
 *          获取前驱结点，获得后继结点
 */
public class BinarySearchTree {
    public TreeNode root;
    public int data;

    public BinarySearchTree(TreeNode root, int data) {
        this.root = root;
        this.data = data;
    }

    public void search(int key){

    }

    public void insert(TreeNode insertedNode){

    }

    public void delete(int key){

    }

    /**
     * 前根遍历
     */
    public void preOrder(TreeNode root){

    }

    /**
     * 中根遍历
     */
    public void inOrder(TreeNode root){

    }

    /**
     * 后根遍历
     */
    public void postOrder(TreeNode root){

    }

    /**
     * 层次遍历
     * @param root
     */
    public void levelOrder(TreeNode root){

    }


    /**
     * 获取前驱结点
     * @return
     */
    public TreeNode getPrecursorNode(TreeNode node){
        return null;
    }

    /**
     * 获取后继节点
     * @return
     */
    public TreeNode getSuccessorNode(TreeNode node){
        return null;
    }
}
