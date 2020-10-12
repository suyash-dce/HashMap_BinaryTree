public class LinkedListNode<Key> implements LinkedListFunction<Key> {

	public Key key;
	public LinkedListFunction<Key> nextNode;
	
	@Override
	public String toString() {
		return "Created Node: "+key;
	}

	public LinkedListNode(Key key) {
		this.key = key;
		this.nextNode = null;
	}

	@Override
	public LinkedListFunction<Key> getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkedListFunction<Key> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public Key getKey() {
		return key;
	}

	@Override
	public void setKey() {
		this.key = key;
	}
}
