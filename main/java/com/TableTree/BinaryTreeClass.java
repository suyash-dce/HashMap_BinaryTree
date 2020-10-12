public class BinaryTreeClass<K extends Comparable<K>> {

	//Root Node declared as Class Var
	public BinaryTreeNode<K> rootNode;

	/**Method to add Root Key to Binary Tree
	 * @param Key value of TreeNode
	 */
	public void add(K key) {
		this.rootNode=this.addRecursive(rootNode,key);
	}

	/**Method to add Key to Binary Tree
	 * @param Key value of TreeNode
	 * @param Node where Key Value is to be placed
	 * @return New Node containing Key 
	 */
	public BinaryTreeNode<K> addRecursive(BinaryTreeNode<K> currNode, K key) {
		if(currNode==null) {
			return new BinaryTreeNode<K>(key);
		}
		int compResult=key.compareTo(currNode.key);
		if (compResult<0) currNode.leftBranch=
				addRecursive(currNode.leftBranch, key);
		else if (compResult>0) currNode.rightBranch=
				addRecursive(currNode.rightBranch, key);
		return currNode;
	}

	/**Method to return total nodes of Binary Tree
	 * @return Size of Tree
	 */
	public int getSize() {
		return this.getSizeRecursive(rootNode);
	}

	/**Method to return total nodes of Binary Tree from particular Node
	 * @return Size of Tree
	 */
	public int getSizeRecursive(BinaryTreeNode<K> currNode) {
		if (currNode==null) return 0;
		else return (1+this.getSizeRecursive(currNode.leftBranch)+
				this.getSizeRecursive(currNode.rightBranch));
	}
}
