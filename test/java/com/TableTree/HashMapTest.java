import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HashMapTest {

	private String line;
	private HashMap<String, Integer> hashMap;
	private String words[];
	
	@Before
	public void init() {
		line="To be or not to be";
		hashMap = new HashMap<String,Integer>();
		words = line.toLowerCase().split(" ");
		for(String word: words) {
        	Integer value = hashMap.get(word);
        	if(value==null) 
        		value = 1;
        	else 
        		value = value+1;
        	hashMap.add(word,value);
        }
		hashMap.showMap();
	}
	
	
	@Test
	public void whenAddedSentanceFrequencyOfToIsTwo() {
		assertEquals(2,(int)hashMap.get("to"));
	}
}
