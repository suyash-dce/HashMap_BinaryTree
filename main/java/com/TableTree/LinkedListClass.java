public class LinkedListClass<Key> {

	public LinkedListFunction<Key> headNode;
	public LinkedListFunction<Key> tailNode;

	public LinkedListClass() {
		this.headNode = null;
		this.tailNode = null;
	}

	public void add(LinkedListFunction<Key> newNode) {

		if(this.tailNode==null) {
			this.tailNode=newNode;
		}

		if(this.headNode==null) {
			this.headNode=newNode;
		}else {
			//swap headnode and newnode
			LinkedListFunction<Key> tempNode=this.headNode;
			this.headNode=newNode;
			(this.headNode).setNextNode(tempNode);
		}
	}

	public void append(LinkedListFunction<Key> newNode) {

		if(this.headNode==null) {
			this.headNode=newNode;
		}

		if(this.tailNode==null) {
			this.tailNode=newNode;
		}else {
			//append entry here
			(this.tailNode).setNextNode(newNode);
			this.tailNode=newNode;
		}
	}
	
	public void showList(){
		LinkedListFunction<Key> tempNode=headNode;
		do {
			System.out.print(tempNode.getKey());
			if (!tempNode.equals(tailNode)) System.out.print("->");
			tempNode=tempNode.getNextNode();
		}while(tempNode!=null && tempNode.getNextNode() != null);
		//System.out.println(tempNode.getKey());
	}
	
	public void insert(LinkedListFunction<Key> beforeNode, LinkedListFunction<Key> newNode) {
		LinkedListFunction<Key> tempNode=beforeNode.getNextNode();
		beforeNode.setNextNode(newNode);
		newNode.setNextNode(tempNode);
	}
	
	public LinkedListFunction<Key> pop() {
		LinkedListFunction<Key> tempNode=headNode;
		headNode=headNode.getNextNode();
		System.out.println("Removed "+tempNode.getKey()+" from Linked List.");
		return tempNode;
	}
	
	public void popLast() {
		LinkedListFunction<Key> tempNode=headNode;
		while((!(tempNode.getNextNode()).equals(tailNode))) {
			tempNode=tempNode.getNextNode();
		}
		tailNode=tempNode;
		tailNode.setNextNode(null);
		System.out.println("Removed "+tempNode.getKey()+" from Linked List.");
	}
	
	public LinkedListFunction<Key> search(Key data) {
		LinkedListFunction<Key> tempNode=headNode;
		while(tempNode!=null && tempNode.getNextNode()!=null) {
			if ((tempNode.getKey()).equals(data)) {
				return tempNode;
			}
			tempNode=tempNode.getNextNode();
		}
		
		System.out.println("No such value exists in LinkedList.");
		return tailNode;
	}
	
	public void insertAfter(Key before_data,Key data) {
		LinkedListNode<Key> before_Node=(LinkedListNode<Key>) search(before_data);
		LinkedListNode<Key> newNode=new LinkedListNode<Key>(data);
		
		//inserting
		insert(before_Node, newNode);
	}
	
	public LinkedListFunction<Key> removeNode(Key data) {
		LinkedListFunction<Key> tempNode=headNode;
		while(tempNode!=null && tempNode.getNextNode()!=null) {
			if ((tempNode.getNextNode().getKey()).equals(data)) {
				System.out.println("Node containing "+data+" removed.");
				tempNode.setNextNode((tempNode.getNextNode()).getNextNode());
			}
			tempNode=tempNode.getNextNode();
		}
		return tempNode;
	}
}
