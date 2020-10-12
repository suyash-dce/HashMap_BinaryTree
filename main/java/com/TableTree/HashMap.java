public class HashMap<K, V> {
	LinkedListClass<K> linkedList;

	public HashMap(){
		linkedList = new LinkedListClass<K>();
	}
	
	public V get(K key) {
		MapNode<K, V> tempNode=(MapNode<K, V>)this.linkedList.search(key);
		if(tempNode==null) return null;
		else return tempNode.getValue();
	}
	
	public void add(K key, V value) {
		MapNode<K,V> tempNode = (MapNode<K,V>) this.linkedList.search(key);
		if(tempNode == null) {
			tempNode = new MapNode<>(key, value);
			this.linkedList.append(tempNode);
		}
		else 
			tempNode.setValue(value);
	}

	public void showMap() {
		System.out.print("HashMap= ");
		linkedList.showList();
	}
}
