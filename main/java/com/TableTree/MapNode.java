public class MapNode<K,V> implements LinkedListFunction<K> {

	K key;
	V value;
	MapNode<K,V> nextNode;
	
	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		nextNode=null;
	}
	
	public void showNode() {
		System.out.print("Hashmap= ");
		System.out.print("MyMapNode:{K= "+key+" : V= "+value+"}");
		if(nextNode!=null) {
			System.out.print("->");
			nextNode.showNode();
		}else System.out.println();
	}
	
	@Override
	public String toString() {
		return "Created Node: ("+key+" : "+value+")";
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey() {
		this.key = key;
	}

	@Override
	public LinkedListFunction<K> getNextNode() {
		return nextNode;
	}

	@Override
	public void setNextNode(LinkedListFunction<K> nextNode) {
		this.nextNode=(MapNode<K, V>) nextNode;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}
