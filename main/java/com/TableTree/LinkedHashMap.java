import java.util.ArrayList;

public class LinkedHashMap<K,V> {
	
	private final int numBuckets;
	ArrayList<LinkedListClass<K>> bucketArray;
	
	public LinkedHashMap() {
		this.numBuckets = 10;
		this.bucketArray = new ArrayList<>(numBuckets);
		for(int i=0;i<numBuckets;i++) {
			this.bucketArray.add(null);
		}
	}
	
	//Function to find index for key
=======
	//Fuction to find index for key
	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode%numBuckets;
		System.out.println("Key: "+key+ ". Hashcode: "+hashCode+". Index: "+index);
		return index;
	}
	
	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedListClass<K> linkedList = this.bucketArray.get(index);
		if(linkedList==null)
			return null;
		MapNode<K,V> tempNode = (MapNode<K,V>) linkedList.search(key);
		if(tempNode==null) return null;
		else return tempNode.getValue();
	}
	
	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedListClass<K> linkedList = this.bucketArray.get(index);
		if(linkedList==null) {
			linkedList = new LinkedListClass<>();
			this.bucketArray.set(index, linkedList);
		}
		MapNode<K,V> tempNode = (MapNode<K,V>) linkedList.search(key);
		if(tempNode == null) {
			tempNode = new MapNode<>(key, value);
			linkedList.append(tempNode);
		}
		else 
			tempNode.setValue(value);
	}
	
	public MapNode<K, V> removeFromMap(K key) {
		int index = this.getBucketIndex(key);
		LinkedListClass<K> linkedList = this.bucketArray.get(index);
		if(linkedList == null) {
			System.out.println("No list found.");
			return null;
		}
		MapNode<K,V> tempNode = (MapNode<K,V>) linkedList.removeNode(key);
		if(tempNode == null) {
			System.out.println(key+" Not found.");
			return null;
		}
		if(tempNode==null) return null;
		else return tempNode;
	}
	
=======
	public void showMap() {
		for (LinkedListClass<K> linkedlist: bucketArray) {
			linkedlist.showList();
		}
	}
}
