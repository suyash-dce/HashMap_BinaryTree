public class BinaryTreeNode<K extends Comparable<K>> {

	//Taking class vars
	K key;
	BinaryTreeNode<K> leftBranch;
	BinaryTreeNode<K> rightBranch;

	/**Constructor of BinaryTreeNode
	 * @param Key value of TreeNode
	 */
	public BinaryTreeNode(K key) {
		this.key = key;
		this.leftBranch = null;
		this.rightBranch = null;
	}
}
