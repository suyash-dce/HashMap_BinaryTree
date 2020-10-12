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
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(95);
        binaryTree.add(11);
        binaryTree.add(65);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(63);
        binaryTree.add(67);
    }

    //Testing for Size of Tree
    @Test
    public void whenTreeCreatedShouldShowSizeAsThree() {
        assertEquals(13, binaryTree.getSize());
    }

    //Testing for RootNode
    @Test
    public void whenTreeCreatedShouldShowRootAs56() {
        assertEquals(56, (int) binaryTree.rootNode.key);
    }

    //Testing for LeftNode
    @Test
    public void whenTreeCreatedShouldShowLeftAs30() {
        assertEquals(30, (int) binaryTree.rootNode.leftBranch.key);
    }

    //Testing for RightNode
    @Test
    public void whenTreeCreatedShouldShowRightAs70() {
        assertEquals(70, (int) binaryTree.rootNode.rightBranch.key);
    }

    //Testing for branches LeftNode
    @Test
    public void whenTreeCreatedShouldShowBranchesOf30As22and40() {
        boolean condition=(binaryTree.rootNode.leftBranch.leftBranch.key==22
                && binaryTree.rootNode.leftBranch.rightBranch.key==40);
        assertTrue(condition);
    }

    //Testing for branches RightNode
    @Test
    public void whenTreeCreatedShouldShowBranchesOf70As60and95() {
        boolean condition=(binaryTree.rootNode.rightBranch.leftBranch.key==60
                && binaryTree.rootNode.rightBranch.rightBranch.key==95);
        assertTrue(condition);
    }
}
