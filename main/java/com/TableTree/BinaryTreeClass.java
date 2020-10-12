public class BinaryTreeClass<K extends Comparable<K>> {

	//Root Node declared as Class Var
	public BinaryTreeNode<K> rootNode;
	public int sizeCount=0;
	public String branchSide;

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

	/**Method to search from Root of Binary Tree
	 * @param Key value of TreeNode
	 * @return 
	 */
	public BinaryTreeNode<K> search(K key) {
		return this.searchRecursive(rootNode,key);
	}

	/**Method to search from Node of Binary Tree
	 * @param Key value of TreeNode
	 * @param Node from where Key Value is to be found
	 * @return Node containing Key 
	 */
	public BinaryTreeNode<K> searchRecursive(BinaryTreeNode<K> currNode, K key) {
		if(currNode==null) {
			System.out.println("Not found.");
			return null;
		}
		int compResult=key.compareTo(currNode.key);
		if (compResult<0) {
			sizeCount++;
			branchSide="left";
			currNode.leftBranch=searchRecursive(currNode.leftBranch, key);
		}
		else if (compResult>0) {
			sizeCount++;
			branchSide="right";
			currNode.rightBranch=searchRecursive(currNode.rightBranch, key);
		}
		if (compResult==0) {
			System.out.println("Found "+key+" at "+sizeCount+"th position, on the "+branchSide+" side, counting from left.");
		}
		return currNode;
	}
}
