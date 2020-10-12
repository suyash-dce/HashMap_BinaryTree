import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedHashMapTest {

	private String paragraph;
	private LinkedHashMap<String, Integer> linkedHashMap;
	private String words[];
	
	@Before
	public void init() {
		paragraph="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		linkedHashMap = new LinkedHashMap<String, Integer>();
		words = paragraph.toLowerCase().split(" ");
		for(String word: words) {
        	Integer value = linkedHashMap.get(word);
        	if(value==null) 
        		value = 1;
        	else 
        		value = value+1;
        	linkedHashMap.add(word,value);
        }
		System.out.println("Original Map-");
		//linkedHashMap.showMap();
		
		//Removing node containing avoidable
		linkedHashMap.removeFromMap("avoidable");
		//Showing Map after removal
		System.out.println("New Map-");
		//linkedHashMap.showMap();
	}
	
	
	@Test
	public void whenAddedParagraphFrequencyOfParanoidIsThree() {
		assertEquals(3,(int)linkedHashMap.get("paranoid"));
	}
	
	@Test
	public void whenRemovedShouldShowKeyValueNull () {
		assertNull(linkedHashMap.get("avoidable"));
	}
}
