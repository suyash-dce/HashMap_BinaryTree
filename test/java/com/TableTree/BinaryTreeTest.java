import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

	private BinaryTreeClass<Integer> binaryTree;

	@Before
	public void init() {
		binaryTree=new BinaryTreeClass<Integer>();

		//adding values to tree
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
	}

	//Testing for Size of Tree
	@Test
	public void whenTreeCreatedShouldShowSizeAsThree() {
		assertEquals(3, binaryTree.getSize());
	}
	
	//Testing for RootNode
	@Test
	public void whenTreeCreatedShouldShowRootAs56() {
		assertEquals(56, (int) binaryTree.rootNode.key);
	}

	//Testing for RootNode
	@Test
	public void whenTreeCreatedShouldShowLeftAs30() {
		assertEquals(30, (int) binaryTree.rootNode.leftBranch.key);
	}

	//Testing for RootNode
	@Test
	public void whenTreeCreatedShouldShowRightAs70() {
		assertEquals(70, (int) binaryTree.rootNode.rightBranch.key);
	}
}
